path=$(shell pwd)

latest:
	docker build -t call-me-application:latest .
