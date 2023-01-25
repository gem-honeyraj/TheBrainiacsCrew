@objects
    nav      xpath           //*[@class='navbar navbar-expand-lg navbar-light text-center']
        logo                 ul li img
        logo-mob    xpath    //nav/a[2]/img[@alt='button']
        menu-item-*          li
    nav-dropdown    id       navbarDropdown
    hamburger               .navbar-toggler
    header-area             .container
        img-txt              img
        img-pic             .imageHero
        buttons             .d-flex justify-content-around
        img-button   xpath   //*[@class='d-flex justify-content-around']
            logo-*           img

    whatIs                          .whatis
        heading-whatis              .text-center span
        heading-whatis-about-us     .text-center .under

    automation-framework    .col-lg-6 col-sm-12 col-12 text-center
        heading             .subheadtext
        setupAndTest        .card  customcard
            logo            img

@groups
    header-elements         header-area.img-button,header-area.img-button.logo-#

= Navigation =

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
            absent
            inside nav ~8px top bottom



= Header =
    header-area:
        below nav 20 to 25px
        centered horizontally inside screen

    header-area.img-txt:
        @on desktop
            aligned horizontally top header-area.img-pic

        @on mobile
            near header-area.img-pic 163px top


    &header-elements:
        visible

= Body =

    whatIs:
        width 100 % of viewport/width
        css color is "rgba(33, 37, 41, 1)"
    whatIs.heading-whatis:
        text is "What Is GemEcosystem ?"
        centered horizontally inside whatIs

    whatIs.heading-whatis-about-us:
        text lowercase is "about us"
        below whatIs.heading-whatis
        centered horizontally inside whatIs




