# Bitmap Transformer

Take a bitmap image and do all sorts of fun stuff via the command line
## Collaborators

Peter Lee and Renee Messick

## Transform Methods
__input__: file path name(src/main/resources/Coffee.bmp)

__output__: new file path name(src/main/resources/{yourFileNameChoice}.bmp)

__transform__:
- "transformGreyScale" Turns the image to a black and white
- "transformPixelate" Turns the image to an adorable pixel image
- "transformNegative" Turns the image to a photo negative

__example: 

./gradlew run --args 'src/main/resources/Coffee.bmp src/main/resources/CoffeeNegative.bmp transformNegative'

## Resources

http://paulbourke.net/dataformats/bitmaps/

https://docs.oracle.com/javase/7/docs/api/java/awt/image/BufferedImage.html#BufferedImage(int,%20int,%20int)

https://stackoverflow.com/questions/25714003/does-java-have-a-bitmap-class

https://docs.oracle.com/javase/tutorial/2d/images/examples/LoadImageApp.java

http://www.javaprogrammingforums.com/file-input-output-tutorials/9377-image-processing-tutorial.html

https://www.dyclassroom.com/image-processing-project/how-to-convert-a-color-image-into-grayscale-image-in-java

http://www.javaprogrammingforums.com/file-input-output-tutorials/9377-image-processing-tutorial.html

https://www.dyclassroom.com/image-processing-project/how-to-convert-a-color-image-into-negative
