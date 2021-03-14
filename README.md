# Reproductor de Vocales

### Explicación De Código Fuente

El programa que se muestra a continuación, fue realizado utilizando hilos, lo cual nos permitirá llevar a cabo lo que se nos pide en el programa. En este programa se muestra un reproductor de las vocales, la cual se reproduce al dar click en el botón iniciar y se suspende al momento de dar click en el botón pausar, al momento de iniciar a reproducirse las vocales en su conjunto esta un audio que menciona cada letra de la vocal de acuerdo a como se muestra.

Comenzamos mostrando en código en donde se importan todas las librerías a utilizar durante la construcción del programa.

![imagen](https://user-images.githubusercontent.com/71055467/111061438-08dbff00-8469-11eb-8224-35674a2859a3.png)

A continuación, se muestras la línea de código se trata de la clase principal, quien hereda de la clase JFrame.

![imagen](https://user-images.githubusercontent.com/71055467/111061446-10030d00-8469-11eb-993b-83a2b3a7b7e8.png)

Las siguientes líneas de código muestran la declaración de las variables que se utilizan en el código.

![imagen](https://user-images.githubusercontent.com/71055467/111061451-15f8ee00-8469-11eb-88f8-9fe33602ae4e.png)

Lo primero que se hará es instanciar un objeto de la clase JLabel con la finalidad de crear un espacio para mostrar una vista previa de las vocales, también se le asignan ciertas características como el centrar la ventana que muestra en centro de la pantalla.

![imagen](https://user-images.githubusercontent.com/71055467/111061457-1c876580-8469-11eb-9371-42867c9fbfd5.png)

Debajo de del espacio donde se mostrarán las vocales, se crearon dos botones, el primero es el botón iniciar, el cual al darle clic ara que las vocales comiencen a reproducirse y al mismo el audio. Las siguientes líneas de código muestran la estructura para el botón iniciar.

![imagen](https://user-images.githubusercontent.com/71055467/111061463-227d4680-8469-11eb-967b-3021b77568eb.png)

Y después de mostrar el primer botón, se muestra las líneas de código del segundo botón y la estructura que este tiene.

![imagen](https://user-images.githubusercontent.com/71055467/111061466-27da9100-8469-11eb-9a98-aa89f7d36f31.png)

Lo siguiente fue hacer que tanto el espacio donde se mostraran las vocales, así como los dos botones que se colocaron fueran visibles.

![imagen](https://user-images.githubusercontent.com/71055467/111061473-2f9a3580-8469-11eb-9486-90156abc6a75.png)

Las siguientes líneas de código son un método el cual permite mostrara las vocales, el primer if que se muestra evalúa si se cumple la condición, en caso de que, si se cumpla, muestra la letra A y también el audio. En este caso para el audio se implementa una excepción o es mismo que el try catch, este sirve para prevenir que el programa se detenga en caso que no se encuentre el audio en la ruta específica y se pueda manejar ese error.
Pasa lo mismo con los siguientes if que se muestran la E, I, O, U respectivamente, y en el caso del audio sucede lo mismo, se implementa try catch.

![imagen](https://user-images.githubusercontent.com/71055467/111061478-37f27080-8469-11eb-87eb-441adaeaaf32.png)
![imagen](https://user-images.githubusercontent.com/71055467/111061483-3cb72480-8469-11eb-961b-2b956577f3db.png)
![imagen](https://user-images.githubusercontent.com/71055467/111061488-404aab80-8469-11eb-9017-044ec534a7e2.png)

Posteriormente se muestra el retorno del programa, de igual manera para que después de un segundo cambie a la siguiente letra y así seguidamente hasta que el usuario presione el botón pausar. Y eso es gracias al método sleep.

![imagen](https://user-images.githubusercontent.com/71055467/111061492-480a5000-8469-11eb-96dd-b1f07a882d74.png)

Y para finalizar el código se muestran las variables que fueron utilizadas durante la construcción del programa, mismas que son declarados por el propio entorno de desarrollo.

![imagen](https://user-images.githubusercontent.com/71055467/111061495-4e003100-8469-11eb-9e67-d68cb34509dd.png)


###Ejecución del programa

Para comprobar que todo el código fuente explicado anteriormente funciona, se presenta unos Screenshots en donde se podrá visualizar la ejecución y el resultado paso a paso.
Como primer paso es ejecutar el programa y nos presenta una ventana de la forma en la que aparece en la imagen, esta parte en donde se mostraran las letras de la vocal y en la parte de abajo se muestran los dos botones que fueron creados, el botón iniciar y el botón pausar.

![imagen](https://user-images.githubusercontent.com/71055467/111061511-5b1d2000-8469-11eb-8e3e-550349bddf5a.png)

Después ejecutamos el programa y nos ha parece la ventana en donde se muestran las vocales, y en los dos botones en color azul lo cual indica que están visibles.

![imagen](https://user-images.githubusercontent.com/71055467/111061515-61ab9780-8469-11eb-8fae-cf31b4bd3324.png)

En el momento en que presionemos el botón iniciar, comenzara a mostrarse las vocales y de igual manera a reproducirse el audio. Como se muestra a continuación.

![imagen](https://user-images.githubusercontent.com/71055467/111061525-683a0f00-8469-11eb-852b-0a64cb89b874.png)
![imagen](https://user-images.githubusercontent.com/71055467/111061530-6a9c6900-8469-11eb-8d05-7c2e2259a4dd.png)
![imagen](https://user-images.githubusercontent.com/71055467/111061531-6c662c80-8469-11eb-9010-6fb714a96e63.png)

Si en algún momento en usuario decide presionar el botón pausar automáticamente las vocales se pausarán y juntamente el audio. Y volviendo a presionar iniciar, seguirá recorriendo la vocal que continuaba y de igual manera el audio.
