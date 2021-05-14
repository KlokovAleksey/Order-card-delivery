# Order-card-delivery

Автоматизированное тестирование новой функции формы заказа доставки карты:

<img width="626" alt="order (1)" src="https://user-images.githubusercontent.com/68289203/118332378-a956aa00-b512-11eb-9176-b7c97dc96b42.png">

Тестируемая функциональность: если заполнить форму повторно теми же данными за исключением "Даты встречи", то система предложит перепланировать время встречи:

<img width="365" alt="replan" src="https://user-images.githubusercontent.com/68289203/118332450-c3908800-b512-11eb-8fbe-4a1f48935c1f.png">

После нажатия на кнопке "Перепланировать" произойдёт перепланирование встречи:

<img width="365" alt="success (1)" src="https://user-images.githubusercontent.com/68289203/118332510-e0c55680-b512-11eb-8270-c3063ba5ad15.png">

Для запуска выполнить команду : ```gradlew clean test```




# [![Build status](https://ci.appveyor.com/api/projects/status/jvua8y8p7f6bwosh?svg=true)](https://ci.appveyor.com/project/KlokovAleksey/order-card-delivery)
