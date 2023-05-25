kubectl apply -f app-deployment.yaml
kubectl apply -f helloworld.yaml
kubectl apply -f app-deployment.yaml

kubectl apply -f gateway1.yaml
kubectl apply -f gateway2.yaml
kubectl apply -f Mutual.yaml

kubectl apply -f isito/egress/dr.yaml
kubectl apply -f isito/egress/gw.yaml
kubectl apply -f isito/egress/se.yaml
kubectl apply -f isito/egress/service-example.yaml
kubectl apply -f isito/egress/vs.yaml

kubectl apply -f isito/ingress/gw.yaml
kubectl apply -f isito/ingress/service-example.yaml
kubectl apply -f isito/ingress/vs.yaml