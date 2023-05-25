${HOSTNAME_OUT} Хост, куда нужно подключаться (исходящий трафик)
${HOSTNAME_EGRESS} имя егресса (селекторы должны совпадать с названием сервиса, деплоймента)
Добавить в service егресса порт:
- name: http-8080
  protocol: TCP
  port: 8080
  targetPort: 8080

(Или использовать существующий)
Примонтировать сертификаты в деплоймент егресса:
/etc/istio/egressgateway-ca-certs/root.crt # Путь до СА в deployment istio egress
/etc/istio/egressgateway-certs/tls.crt # Путь до клиенсткого сертификата в deployment istio egress
/etc/istio/egressgateway-certs/tls.key # Путь до ключа в deployment istio egress