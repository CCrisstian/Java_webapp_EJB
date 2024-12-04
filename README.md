<h1 align="center">Enterprise JavaBeans (EJB)</h1>
<p><b>Enterprise JavaBeans (EJB)</b> es una tecnología del estándar <b>Jakarta EE (antes Java EE)</b> diseñada para simplificar el desarrollo de aplicaciones empresariales distribuidas y escalables. EJB proporciona un modelo robusto para el desarrollo de aplicaciones que requieren características avanzadas, como transacciones, seguridad y concurrencia, sin que el desarrollador tenga que manejar todos los detalles complejos a nivel de código.</p>

<h3>Características</h3>

- <b>Transacciones</b>: `EJB` administra transacciones automáticamente mediante la API de `Java Transaction` (`JTA`). Permite garantizar la integridad de los datos mediante reglas como todo o nada (commit o rollback), sin que el desarrollador implemente lógica compleja.

- <b>Comunicación Remota</b>: `EJB` permite que los `beans` sean llamados de manera remota a través de la red usando protocolos como RMI o HTTP, facilitando la creación de aplicaciones distribuidas. Esto es ideal para sistemas con múltiples nodos.

- <b>Concurrencia</b>: `EJB` gestiona automáticamente el acceso simultáneo a los `beans`, asegurando que múltiples clientes puedan interactuar con ellos sin causar conflictos. Esto evita problemas como el acceso inconsistente a los datos.

- <b>JNDI (Java Naming and Directory Interface)</b>: Es el mecanismo que permite localizar recursos y `EJBs` en un servidor de aplicaciones. Proporciona una referencia uniforme para acceder a `beans` o servicios (por ejemplo, bases de datos, colas JMS).

- <b>Seguridad</b>: `EJB` implementa un modelo de seguridad basado en roles. Permite restringir el acceso a métodos según roles definidos, utilizando anotaciones como @RolesAllowed o configuraciones declarativas en el servidor.

- <b>Integración con JPA (Java Persistence API)</b>: `EJB` se integra de forma nativa con `JPA` para gestionar persistencia de datos. Esto facilita operaciones CRUD en bases de datos mediante entidades y evita el uso de `SQL` explícito.

- <b>Integración con CDI (Contexts and Dependency Injection)</b>: `CDI` permite inyección de dependencias y control del ciclo de vida de los `beans` en `EJB`. Esto hace que los `EJB` se integren fácilmente en aplicaciones con un manejo más flexible de componentes.

<h3>Tipos de EJB</h3>

- Sin Estado (`@Stateless`): Un `EJB` `@Stateless` no guarda información específica del cliente entre llamadas. Es ideal para operaciones independientes que no requieren contexto previo.
  - No mantienen estado entre las interacciones.
  - Se reutilizan entre múltiples clientes, mejorando el rendimiento.
  - Perfectos para servicios que ejecutan lógica repetitiva, como cálculos o acceso a bases de datos.

- Con Estado (`@Stateful`): Un `EJB` `@Stateful` guarda información del cliente durante la sesión, manteniendo su estado entre múltiples llamadas.
  - Mantienen el estado mientras dure la interacción con el cliente.
  - Útiles para casos donde se necesita rastrear la actividad del cliente (por ejemplo, un carrito de compras).
  - Se destruyen cuando el cliente finaliza la sesión.

- Única instancia (`@Singleton`): Un `EJB` `@Singleton` tiene una única instancia en toda la aplicación, compartida por todos los clientes. Es ideal para administrar recursos compartidos.
  - Se inicializa una vez y se utiliza durante todo el ciclo de vida de la aplicación.
  - Útil para manejar configuraciones globales, caché, o controladores centralizados.
  - Puede ser <b>thread-safe</b> con anotaciones como `@Lock`.

<h3>Ventajas de usar EJB</h3>

- <b>Simplificación del desarrollo</b>: EJB maneja aspectos complejos como concurrencia, transacciones y seguridad.
- <b>Soporte para aplicaciones distribuidas</b>: Los beans pueden ejecutarse en servidores separados y ser llamados desde cualquier lugar.
- <b>Reusabilidad y escalabilidad</b>: Permite que la lógica empresarial se encapsule en componentes reutilizables, listos para escalar en entornos empresariales.
