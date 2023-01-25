@objects
    nav      xpath           //*[@class='navbar navbar-expand-lg navbar-light text-center']
            logo                 ul li img
            logo-mob    xpath    //nav/a[2]/img[@alt='button']
            menu-item-*          li
    nav-dropdown    id       navbarDropdown
    hamburger               .navbar-toggler


@rule all test for nav bar
    @on desktop
        nav.logo:
            visible
    @on mobile
        nav.logo-mob:
            visible

    @on desktop
        @for [ 1 - 5 ] as index
            nav.menu-item-${index}:
                left-of nav.menu-item-${index+1} ~ 0px

        nav:
                width 100 % of viewport/width
                centered horizontally inside screen
                contains nav.menu-item-*

    nav.menu-item-*:
        @on desktop
            count visible nav.menu-item-* is 6
            height 45px

        @on mobile
            absent


    @on mobile
        hamburger:
            visible
            inside nav ~8px top bottom

