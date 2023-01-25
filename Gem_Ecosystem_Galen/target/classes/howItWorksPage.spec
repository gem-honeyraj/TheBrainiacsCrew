@import navRules.spec

@objects
    how-it-works-heading        .heroText
    first-row-container xpath   //*[@class='cardHero mb-5 py-4']
    image-in-header     xpath   (//*[@class='imageHerohow'])[1]

@set
    image_height  250 to 300px

= Image test =
    @if ${isVisible("image-in-header")}
            image-in-header:
                image file src/main/Test_Images/header_image.png, error 70%
                height ${image_height}
              #  image file src/main/Test_Images/header_image.png, error 118597, filter-a blur 10, error 20%
    @else
        @die "Image not present"

= Header =
    how-it-works-heading:
        inside first-row-container

= Navigation =
    | all test for nav bar