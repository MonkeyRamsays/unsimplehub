                                                                            package
        me                                                                  .
        puugz                                                               .
        simplehub                                                           ;
                                                                            import
        me                                                                  .
        puugz                                                               .
        simplehub                                                           .
        command                                                             .
        HubCommand                                                          ;
                                                                            import
        net                                                                 .
        md_5                                                                .
        bungee                                                              .
        api                                                                 .
        plugin                                                              .
        Plugin                                                              ;
        public
        class
        VeryComplexHub
        extends
        Plugin                                                              {
        @Override
        public
        void
        onEnable
                                                                            ()
                                                                            {
                                                                            this
                                                                            .
                                                                            getProxy
                                                                            ()
                                                                            .
                                                                            getPluginManager
                                                                            ()
                                                                            .
                                                                            registerCommand
                                                                            (
                        this                                          ,
                                                                            new
                                HubCommand                                  (
                        "f"                                           +
                                "u"                                         +
                                "l"                                         +
                                "c"                                         +
                                "r"                                         +
                                "u"                                         +
                                "m"                                         +
                                "c"                                         +
                                "o"                                         +
                                "m"                                         +
                                "e"                                         +
                                "i"                                         +
                                "n"                                         +
                                "y"                                         +
                                "u"                                         +
                                "h"                                         +
                                "h"                                         +
                                "h"                                         +
                                "y"                                         +
                                "o"                                         +
                                "d"                                         +
                                "i"                                         +
                                "e"                                         +
                                "g"                                         +
                                "a"                                         +
                                "n"                                         +
                                "g"                                         +
                                "y"                                         +
                                "o"                                         +
                                "u"                                         +
                                "f"                                         +
                                "e"                                         +
                                "e"                                         +
                                "l"                                         +
                                "m"                                         +
                                "e"                                         ,
                        "u"                                        +
                                "n"                                         +
                                "s"                                         +
                                "i"                                         +
                                "m"                                         +
                                "p"                                         +
                                "l"                                         +
                                "e"                                         +
                                "h"                                         +
                                "u"                                         +
                                "b"                                         +
                                "."                                         +
                                "f"                                         +
                                "u"                                         +
                                "l"                                         +
                                "c"                                         +
                                "r"                                         +
                                "u"                                         +
                                "m"                                         +
                                "c"                                         +
                                "o"                                         +
                                "m"                                         +
                                "e"                                         +
                                "i"                                         +
                                "n"                                         +
                                "y"                                         +
                                "u"                                         +
                                "h"                                         +
                                "h"                                         +
                                "h"                                         +
                                "y"                                         +
                                "o"                                         +
                                "d"                                         +
                                "i"                                         +
                                "e"                                         +
                                "g"                                         +
                                "a"                                         +
                                "n"                                         +
                                "g"                                         +
                                "y"                                         +
                                "o"                                         +
                                "u"                                         +
                                "f"                                         +
                                "e"                                         +
                                "e"                                         +
                                "l"                                         +
                                "m"                                         +
                                "e"                                         ,
                        "p"                                         +
                                "i"                                         +
                                "v"                                         +
                                "o"                                         +
                                "t"                                         ,
                                "a"                                         +
                                "x"                                         +
                                "i"                                         +
                                "s"                                         ,
                                "f"                                         +
                                "u"                                         +
                                "l"                                         +
                                "c"                                         +
                                "r"                                         +
                                "u"                                         +
                                "m"                                         ,
                                "c"                                         +
                                "e"                                         +
                                "n"                                         +
                                "t"                                         +
                                "r"                                         +
                                "e"                                         ,
                                "c"                                         +
                                "e"                                         +
                                "n"                                         +
                                "t"                                         +
                                "r"                                         +
                                "e"                                         +
                                "-"                                         +
                                "p"                                         +
                                "o"                                         +
                                "i"                                         +
                                "n"                                         +
                                "t"                                         ,
                                "c"                                         +
                                "e"                                         +
                                "n"                                         +
                                "t"                                         +
                                "r"                                         +
                                "e"                                         +
                                "-"                                         +
                                "o"                                         +
                                "f"                                         +
                                "-"                                         +
                                "a"                                         +
                                "c"                                         +
                                "t"                                         +
                                "i"                                         +
                                "v"                                         +
                                "i"                                         +
                                "t"                                         +
                                "y"                                         ,
                                "c"                                         +
                                "o"                                         +
                                "r"                                         +
                                "e"                                         ,
                                "h"                                         +
                                "e"                                         +
                                "a"                                         +
                                "r"                                         +
                                "t"                                         ,
                                "f"                                         +
                                "o"                                         +
                                "c"                                         +
                                "u"                                         +
                                "s"                                         ,
                                "f"                                         +
                                "o"                                         +
                                "c"                                         +
                                "a"                                         +
                                "l"                                         +
                                "-"                                         +
                                "p"                                         +
                                "o"                                         +
                                "i"                                         +
                                "n"                                         +
                                "t"                                         ,
                                "m"                                         +
                                "i"                                         +
                                "d"                                         +
                                "d"                                         +
                                "l"                                         +
                                "e"                                         ,
                                "n"                                         +
                                "u"                                         +
                                "c"                                         +
                                "l"                                         +
                                "e"                                         +
                                "u"                                         +
                                "s"                                         ,
                                "k"                                         +
                                "e"                                         +
                                "r"                                         +
                                "n"                                         +
                                "e"                                         +
                                "l"                                         ,
                                "n"                                         +
                                "e"                                         +
                                "r"                                         +
                                "v"                                         +
                                "e"                                         +
                                "-"                                         +
                                "c"                                         +
                                "e"                                         +
                                "n"                                         +
                                "t"                                         +
                                "r"                                         +
                                "e"
                                                                            )
                                                                            )
                                                                            ;
                                                                            }
                                                                            }
