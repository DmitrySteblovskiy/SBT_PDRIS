# SBT_PDRIS

1) Установка minicube, istio (я делал через хелм):
https://helm.sh/docs/intro/install/
https://istio.io/latest/docs/setup/platform-setup/minikube/
https://istio.io/latest/docs/setup/install/helm/
https://istio.io/latest/docs/tasks/traffic-management/egress/egress-gateway/

2) Создали сертификаты  (клиентские и серверные), по этой доке (и добавили в деплойменты истио):
https://istio.io/latest/docs/tasks/traffic-management/ingress/secure-ingress/

3) Запустили deployment для helloworld (простенькая приложа)

4) Запустили minikube tunnel, обезопасили mutual gateways:
https://istio.io/latest/docs/setup/getting-started/#download
https://istio.io/latest/docs/tasks/traffic-management/ingress/secure-ingress/

5) Создали два неймспейса (для приложения App из примера и приложения за эгрессом mlts)

6) Запускаем и проверяем (команда для запросов test внутри деплоймента) :)