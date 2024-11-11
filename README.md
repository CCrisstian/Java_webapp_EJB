<h1 align="center">Enterprise JavaBeans (EJB)</h1>
<p><b>Enterprise JavaBeans (EJB)</b> es una tecnología del estándar <b>Jakarta EE (antes Java EE)</b> diseñada para simplificar el desarrollo de aplicaciones empresariales distribuidas y escalables. EJB proporciona un modelo robusto para el desarrollo de aplicaciones que requieren características avanzadas, como transacciones, seguridad y concurrencia, sin que el desarrollador tenga que manejar todos los detalles complejos a nivel de código.</p>

<h3>¿Para qué sirve EJB?</h3>

- <b>Desarrollar lógica empresarial</b>: Permite implementar y encapsular la lógica empresarial en clases Java conocidas como "beans". Estos beans pueden realizar operaciones importantes como cálculos, validaciones y la administración de datos en la aplicación.
- <b>Gestionar transacciones</b>: EJB facilita la administración de transacciones, asegurando que un conjunto de operaciones se ejecute de forma completa o se deshaga en caso de errores (integridad transaccional). Esto es crucial en aplicaciones que interactúan con bases de datos o sistemas externos.
- <b>Controlar la seguridad</b>: Ofrece un modelo de seguridad robusto que permite definir permisos de acceso a métodos y recursos, de acuerdo con los roles de usuario de la aplicación.
- <b>Escalabilidad y concurrencia</b>: Los EJB están diseñados para aplicaciones de gran escala que necesitan manejar múltiples usuarios y procesos al mismo tiempo, distribuyéndose en servidores de aplicaciones para equilibrar la carga.
- <b>Integración con sistemas externos</b>: Permite la interacción con otros sistemas y servicios, incluso si están en servidores o plataformas distintas, lo que facilita la integración en arquitecturas de aplicaciones distribuidas.

<h3>Tipos de EJB</h3>

- <b>Session Beans (Beans de sesión)</b>: Realizan tareas específicas y representan el "estado" temporal de una interacción con un cliente.
  - <b>Stateless Session Beans</b>: No retienen estado entre llamadas del cliente. Son ideales para operaciones independientes y de corta duración.
  - <b>Stateful Session Beans</b>: Mantienen el estado del cliente a lo largo de una sesión específica. Son útiles en casos donde el contexto del cliente es importante.

- <b>Entity Beans</b>: Representaban datos persistentes que se almacenan en una base de datos. Con la llegada de JPA (Java Persistence API), los Entity Beans quedaron obsoletos y fueron reemplazados por la JPA.
- <b>Message-Driven Beans (MDB)</b>: Responden a mensajes asincrónicos, especialmente en aplicaciones que usan sistemas de mensajería (como JMS). Son útiles para la integración en arquitecturas orientadas a eventos.

<h3>Ventajas de usar EJB</h3>

- <b>Simplificación del desarrollo</b>: EJB maneja aspectos complejos como concurrencia, transacciones y seguridad.
- <b>Soporte para aplicaciones distribuidas</b>: Los beans pueden ejecutarse en servidores separados y ser llamados desde cualquier lugar.
- <b>Reusabilidad y escalabilidad</b>: Permite que la lógica empresarial se encapsule en componentes reutilizables, listos para escalar en entornos empresariales.
