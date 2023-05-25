# SBT_PDRIS

К счастью, второе дз легко переделывается из третьего)
\par
Вместо httpbin example использовал beeceptor в качестве External Service. Очень удобно - всем советую.
(ссылка на мой эндпоинт: https://sbttest.free.beeceptor.com)

1) Установка minicube, istio (я делал через хелм):
https://helm.sh/docs/intro/install/
https://istio.io/latest/docs/setup/platform-setup/minikube/
https://istio.io/latest/docs/setup/install/helm/
https://istio.io/latest/docs/tasks/traffic-management/egress/egress-gateway/

2) Создали сертификаты  (клиентские и серверные), не забыли про secured mutual gateways, всё по этой доке (и добавили в деплойменты истио):
https://istio.io/latest/docs/tasks/traffic-management/ingress/secure-ingress/
Скрипт с соответствующим названием cert.sh имеется

3) Запустили deployment для helloworld (простенькая приложа)

4) Запустили minikube tunnel:
https://istio.io/latest/docs/setup/getting-started/#download
https://istio.io/latest/docs/tasks/traffic-management/ingress/secure-ingress/

5) Создали два неймспейса (для приложения App из примера и mlts за ингрессом)

6) Запускаем и проверяем с помощью ExternalTest.sh, а ссылка есть в начале :)
