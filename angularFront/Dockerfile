# Etapa 1: Construcción de la app Angular
FROM node:18 AS build
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build --prod

# Etapa 2: Servir la app con Nginx
FROM nginx:alpine
COPY --from=build /app/dist/angular-front /usr/share/nginx/html
EXPOSE 80
