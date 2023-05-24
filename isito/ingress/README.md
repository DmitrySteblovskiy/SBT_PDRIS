${HOSTNAME_IN} Хост, куда нужно подключаться (входящий трафик)
${HOSTNAME_INGRESS} Имя ингресса (селекторы должны совпадать с названием сервиса, деплоймента)
Добавить в service ингресса порт:
- name: https
  protocol: TCP
  port: 443
  targetPort: 5443

(Или использовать существующий)

/etc/istio/ingressgateway-ca-certs/ca-chain.cert.pem
/etc/istio/ingressgateway-certs/tls.key
/etc/istio/ingressgateway-certs/tls.crt

Нужно примонтировать сертификаты (клиентские и серверные)