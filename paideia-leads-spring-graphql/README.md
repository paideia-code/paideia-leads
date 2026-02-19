### mutations
```
mutation {
  insertWhatsappLead(input: {
    nombre: "Juan Pérez"
    celular: "1234567890"
    sucursal: "Sucursal Centro"
    correo: "juan@example.com"
  }) {
    status
    data {
      id
      name
    }
  }
}
```
```
mutation {
  insertWhatsappLead(input: {
    nombre: "Pablo Mendoza"
    celular: "1234"
    sucursal: "Sucursal Santiago"
    correo: "pablo@example.com"
  }) {
    status
    data {
      id
      name
    }
  }
}
```
### query
```
query {
  getAllLeads {
    id
    name
  }
}
```