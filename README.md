# kubernetes-demo

## Create Cluster

```
gcloud container clusters create demo-cluster \
  --zone asia-northeast1-a \
  --num-nodes 1 \
  --machine-type n1-standard-1 \
  --enable-stackdriver-kubernetes \
  --enable-autoupgrade \
  --enable-autorepair
```

test
