package
        yo.its.me.unsimplehub.command
;
import
net  .
md_5.
bungee  .
api .
ChatColor
;
import
net  .
md_5.
bungee  .
api .
CommandSender
;
import
net  .
md_5.
bungee  .
api .
ProxyServer
;
import
net  .
md_5.
bungee  .
api .
chat
.TextComponent;
import
net  .
md_5.
bungee  .
api .
config
.ServerInfo;
import
net  .
md_5.
bungee  .
api .
connection
.ProxiedPlayer;
import
net  .
md_5.
bungee  .
api .
plugin
.Command;
import
net  .
md_5.
bungee  .
config  .
Configuration
;
public
class
HubCommand
extends
Command
{
public
HubCommand
(
String
name
,
String
permission
,
String
...
aliases
)
{
super
(
name
,
permission
,
aliases
)
;
}
@Override
public
void
execute
(
CommandSender
sender
,
String
[
]
args
)
{
if
(
!
(
sender
instanceof
ProxiedPlayer
)
)
{
final
TextComponent
text
=
new
TextComponent
(
"O"
+
"n"
+
"l"
+
"y"
+
" "
+
"p"
+
"l"
+
"a"
+
"y"
+
"e"
+
"r"
+
"s"
+
" "
+
"m"
+
"a"
+
"y"
+
" "
+
"e"
+
"x"
+
"e"
+
"c"
+
"u"
+
"t"
+
"e"
+
" "
+
"t"
+
"h"
+
"i"
+
"s"
+
" "
+
"c"
+
"o"
+
"m"
+
"m"
+
"a"
+
"n"
+
"d"
+
"."
)
;
text
.
setColor
(
ChatColor
.
RED
)
;
sender
.
sendMessage
(
text
)
;
return
;
}
final
ServerInfo
targetServer
=
ProxyServer
.
getInstance
(
)
.
getServerInfo
(
""
+
"h"
+
"u"
+
"b"
+
""
)
;
final
ProxiedPlayer
player
=
(
ProxiedPlayer
)
sender
;
if
(
targetServer
==
null
)
{
final
TextComponent
text
=
new
TextComponent
(
""
+
""
+
"T"
+
"h"
+
"e"
+
" "
+
"s"
+
"e"
+
"r"
+
"v"
+
"e"
+
"r"
+
" "
+
"y"
+
"o"
+
"u"
+
" "
+
"t"
+
"r"
+
"i"
+
"e"
+
"d"
+
" "
+
"t"
+
"o"
+
" "
+
"c"
+
"o"
+
"n"
+
"n"
+
"e"
+
"c"
+
"t"
+
" "
+
"t"
+
"o "
+
"d"
+
"o"
+
"e"
+
"s"
+
" "
+
"n"
+
"ot"
+
" "
+
"e"
+
"x"
+
"i"
+
"s"
+
"t"
+
"."
)
;
text
.
setColor
(
ChatColor
.
RED
)
;
player
.
sendMessage
(
text
)
;
return
;
}
if
(
player
.
getServer
(
)
.
getInfo
(
)
.
equals
(
targetServer
)
)
{
final
TextComponent
text
=
new
TextComponent
(
""
+
"Y"
+
"o"
+
"u"
+
" "
+
"a"
+
"re"
+
" "
+
"a"
+
"l"
+
"r"
+
"e"
+
"a"
+
"dy"
+
" "
+
"c"
+
"o"
+
"n"
+
"n"
+
"e"
+
"c"
+
"t"
+
"e"
+
"d"
+
" t"
+
"o"
+
" "
+
"t"
+
"h"
+
"e"
+
" "
+
"h"
+
"u"
+
"b"
+
"!"
+
""
)
;
text
.
setColor
(
ChatColor
.
RED
)
;
player
.
sendMessage
(
text
)
;
return
;
}
final
TextComponent
text
=
new
TextComponent
(
TextComponent
.
fromLegacyText
(
ChatColor
.
translateAlternateColorCodes
(
'&'
,
"" 
+
"&e" 
+
"Y" 
+
"o" 
+
"u" 
+
" " 
+
"w" 
+
"i" 
+
"l" 
+
"l" 
+
" " 
+
"b" 
+
"e" 
+
" " 
+
"o" 
+
"n" 
+
" " 
+
"t" 
+
"h" 
+
"e" 
+
" h" 
+
"u" 
+
"b" 
+
" " 
+
"in" 
+
" " 
+
"1" 
+
"0" 
+
" " 
+
"m" 
+
"i" 
+
"n" 
+
"u" 
+
"te" 
+
"s" 
+
"." 
+
""
)
)
)
;
player
.
sendMessage
(
text
)
;
player
.
connect
(
targetServer
)
;
}
}
