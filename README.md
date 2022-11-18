<!--
 ___ _            _ _    _ _    __
/ __(_)_ __  _ __| (_)__(_) |_ /_/
\__ \ | '  \| '_ \ | / _| |  _/ -_)
|___/_|_|_|_| .__/_|_\__|_|\__\___|
            |_| 
-->
![](https://docs.simplicite.io//logos/logo250.png)
* * *

`CARTO` module definition
=========================



`CartoActivity` business object definition
------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoActName`                                               | char(100)                                | yes*     | yes       |          | -                                                                                |
| `cartoDescription`                                           | text(100)                                |          | yes       |          | -                                                                                |

`CartoAppBuscon` business object definition
-------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoAppbusconType`                                         | enum(100) using `CARTOAPPBUSCONTYPE` list | yes*     | yes       |          | -                                                                                |
| `cartoAppbusconAppId` link to **`CartoApplication`**         | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `cartoAppbusconAppId.cartoAppId`_                      | _char(100)_                              |          |           |          | -                                                                                |
| _Ref. `cartoAppbusconAppId.cartoAppName`_                    | _char(100)_                              |          |           |          | -                                                                                |
| `cartoAppbusconBusconId` link to **`CartoBusinessConcept`**  | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `cartoAppbusconBusconId.cartoBusconKdId`_              | _id_                                     |          |           |          | -                                                                                |
| _Ref. `cartoBusconKdId.cartoKdName`_                         | _char(100)_                              |          |           |          | -                                                                                |
| _Ref. `cartoAppbusconBusconId.cartoBusconName`_              | _char(100)_                              |          |           |          | -                                                                                |

### Lists

* `CARTOAPPBUSCONTYPE`
    - `PRN` Principal
    - `SCN` Secondaire

`CartoAppFct` business object definition
----------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoAppfctAppId` link to **`CartoApplication`**            | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `cartoAppfctAppId.cartoAppId`_                         | _char(100)_                              |          |           |          | -                                                                                |
| `cartoAppfctFctId` link to **`CartoFunction`**               | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `cartoAppfctFctId.cartoFctName`_                       | _char(100)_                              |          |           |          | -                                                                                |

`CartoApplication` business object definition
---------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoAppId`                                                 | char(100)                                | yes*     |           |          | -                                                                                |
| `cartoAppName`                                               | char(100)                                | yes      | yes       |          | -                                                                                |
| `cartoAppDescription`                                        | text(100)                                | yes      | yes       |          | -                                                                                |
| `cartoAppVersion`                                            | char(100)                                |          | yes       |          | -                                                                                |
| `cartoAppInternetFacing`                                     | boolean                                  |          | yes       |          | -                                                                                |
| `cartoAppPersonalData`                                       | boolean                                  |          | yes       |          | -                                                                                |
| `cartoAppCiatConf`                                           | enum(100) using `CARTOAPPCIATCONF` list  |          | yes       |          | -                                                                                |
| `cartoAppCiatIntegrity`                                      | enum(100) using `CARTOAPPCIATINTEGRITY` list |          | yes       |          | -                                                                                |
| `cartoAppCiatAvailability`                                   | enum(100) using `CARTOAPPCIATAVAILABILITY` list |          | yes       |          | -                                                                                |
| `cartoAppRto`                                                | enum(100) using `CARTOAPPRTO` list       |          | yes       |          | -                                                                                |
| `cartoAppRpo`                                                | enum(100) using `CARTOAPPRTO` list       |          | yes       |          | -                                                                                |
| `cartoAppCiatLast`                                           | date                                     |          | yes       |          | -                                                                                |
| `cartoAppClass`                                              | enum(100) using `CARTOAPPCLASS` list     |          | yes       |          | -                                                                                |
| `cartoAppAuthentication`                                     | enum(100) using `CARTOAPPAUTHENTICATION` list |          | yes       |          | -                                                                                |
| `cartoAppStatus`                                             | enum(100) using `CARTOAPPSTATUS` list    |          | yes       |          | -                                                                                |
| `cartoAppM2c`                                                | enum(100) using `CARTOAPPM2C` list       |          | yes       |          | -                                                                                |
| `cartoAppTypeDev`                                            | enum(100) using `CARTOAPPTYPEDEV` list   |          | yes       |          | -                                                                                |
| `cartoAppCloudModelService`                                  | enum(100) using `CARTOAPPCLOUDMODELSERVICE` list |          | yes       |          | -                                                                                |
| `cartoAppBusId` link to **`CartoBusiness`**                  | id                                       | yes      | yes       |          | -                                                                                |
| _Ref. `cartoAppBusId.cartoBusName`_                          | _char(100)_                              |          |           |          | -                                                                                |
| _Ref. `cartoAppBusId.cartoBusBuscatId`_                      | _id_                                     |          |           |          | -                                                                                |
| `cartoAppDomId` link to **`CartoItDomain`**                  | id                                       | yes      | yes       |          | -                                                                                |
| _Ref. `cartoAppDomId.cartoDomName`_                          | _char(100)_                              |          |           |          | -                                                                                |
| `cartoParentAppId` link to **`CartoApplication`**            | id                                       |          | yes       |          | -                                                                                |
| _Ref. `cartoParentAppId.cartoAppId`_                         | _char(100)_                              |          |           |          | -                                                                                |
| _Ref. `cartoParentAppId.cartoAppName`_                       | _char(100)_                              |          |           |          | -                                                                                |
| `cartoAppTraceability`                                       | enum(100) using `CARTOAPPTRACEABILITY` list |          | yes       |          | -                                                                                |
| `cartoAppHostingType`                                        | enum(100) using `CARTOAPPHOSTINGTYPE` list |          | yes       |          | -                                                                                |
| `cartoAppHostingProvider`                                    | char(255)                                |          | yes       |          | -                                                                                |
| `cartoAppChartBase`                                          | text(1000000)                            |          | yes       |          | -                                                                                |

### Lists

* `CARTOAPPCIATCONF`
    - `1` 1 - Public
    - `2` 2 - Standard
    - `3` 3 - Confidential
    - `4` 4 - Secret
* `CARTOAPPCIATINTEGRITY`
    - `1` 1 - None
    - `2` 2 - Standard
    - `3` 3 - Reinforced
    - `4` 4 - Unalterable
* `CARTOAPPCIATAVAILABILITY`
    - `1` 1 - Minimum Service
    - `2` 2 - Medium
    - `3` 3 - Strong
    - `4` 4 -  No unavailability tolerated
* `CARTOAPPRTO`
    - `MORE24` >24h
    - `8TO24` 8h to 24h
    - `4TO8` 4h to 8h
    - `LESS4` <4h
* `CARTOAPPCLASS`
    - `1` Class 1
    - `2` Class 2
    - `3` Class 3
* `CARTOAPPAUTHENTICATION`
    - `SSO` SSO
    - `SSOITG` SSO ITG
    - `SSOCIB` SSO CIB
    - `ADFSBNPPRE` ADFS BNPPRE
    - `ADFSEURO` ADFS EURO
    - `GUIDECAS` GuideCas
    - `INTERNAL` Internal
    - `INTERNALDB` Internal database
    - `NOAUTH` No Authentification
* `CARTOAPPSTATUS`
    - `INPROG` In Progress
    - `LIVE` Live
    - `OGDECOM` On-going decommissioning
    - `DECOM` Decommissioned
    - `BSTOP` Business stopped
* `CARTOAPPM2C`
    - `A` Not Eligible
    - `B` Already on external Cloud
    - `C` Elligible
    - `D` Not evaluated
* `CARTOAPPTYPEDEV`
    - `INHOUSE` In House
    - `CSP` Customer software package
    - `OUTDEV` Outsourced dev
    - `INANDOUT` Internal & outsourced dev
* `CARTOAPPCLOUDMODELSERVICE`
    - `OP` Internal (on prem)
    - `SAAS` SaaS
    - `PAAS` PaaS
    - `IAAS` IaaS
* `CARTOAPPTRACEABILITY`
    - `1` 1 - None
    - `2` 2 - Minimal
    - `3` 3 - Simple
    - `4` 4 - Detailed
* `CARTOAPPHOSTINGTYPE`
    - `E` External
    - `I` Internal
    - `S` Subscription

### Custom actions

* `SAVE_CHART`: 

`CartoAppUsr` business object definition
----------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoAppusrAppId` link to **`CartoApplication`**            | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `cartoAppusrAppId.cartoAppId`_                         | _char(100)_                              |          |           |          | -                                                                                |
| `cartoAppusrUsrId` link to **`CartoUser`**                   | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `cartoAppusrUsrId.usr_login`_                          | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |
| `cartoAppusrRole`                                            | enum(100) using `CARTOAPPUSRROLE` list   | yes*     | yes       |          | -                                                                                |

### Lists

* `CARTOAPPUSRROLE`
    - `SPOC` SPOC
    - `PO` PO

`CartoBusiness` business object definition
------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoBusName`                                               | char(100)                                | yes*     | yes       |          | -                                                                                |
| `cartoBusBuscatId` link to **`CartoBusinessCategory`**       | id                                       | *        | yes       |          | -                                                                                |
| _Ref. `cartoBusBuscatId.cartoBuscatName`_                    | _char(100)_                              |          |           |          | -                                                                                |
| `cartoDescription`                                           | text(100)                                |          | yes       |          | -                                                                                |

`CartoBusinessCategory` business object definition
--------------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoBuscatName`                                            | char(100)                                | yes*     | yes       |          | -                                                                                |
| `cartoDescription`                                           | text(100)                                |          | yes       |          | -                                                                                |

`CartoBusinessConcept` business object definition
-------------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoBusconName`                                            | char(100)                                | yes*     | yes       |          | -                                                                                |
| `cartoDescription`                                           | text(100)                                |          | yes       |          | -                                                                                |
| `cartoBusconKdId` link to **`CartoKeyData`**                 | id                                       | *        | yes       |          | -                                                                                |
| _Ref. `cartoBusconKdId.cartoKdName`_                         | _char(100)_                              |          |           |          | -                                                                                |

`CartoCmpSrv` business object definition
----------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoCmpsrvCmpId` link to **`CartoComponent`**              | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `cartoCmpsrvCmpId.cartoCmpAppId`_                      | _id_                                     |          |           |          | -                                                                                |
| _Ref. `cartoCmpAppId.cartoAppId`_                            | _char(100)_                              |          |           |          | -                                                                                |
| _Ref. `cartoCmpsrvCmpId.cartoCmpName`_                       | _char(100)_                              |          |           |          | -                                                                                |
| `cartoCmpsrvSrvId` link to **`CartoServer`**                 | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `cartoCmpsrvSrvId.cartoSrvName`_                       | _char(100)_                              |          |           |          | -                                                                                |

`CartoCmpTech` business object definition
-----------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoCmptechTechId` link to **`CartoTechnology`**           | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `cartoCmptechTechId.cartoTechName`_                    | _char(100)_                              |          |           |          | -                                                                                |
| _Ref. `cartoCmptechTechId.cartoTechVersion`_                 | _char(100)_                              |          |           |          | -                                                                                |
| `cartoCmptechCmpId` link to **`CartoComponent`**             | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `cartoCmptechCmpId.cartoCmpAppId`_                     | _id_                                     |          |           |          | -                                                                                |
| _Ref. `cartoCmpAppId.cartoAppId`_                            | _char(100)_                              |          |           |          | -                                                                                |
| _Ref. `cartoCmpAppId.cartoAppName`_                          | _char(100)_                              |          |           |          | -                                                                                |
| _Ref. `cartoCmptechCmpId.cartoCmpName`_                      | _char(100)_                              |          |           |          | -                                                                                |

`CartoComponent` business object definition
-------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoCmpAppId` link to **`CartoApplication`**               | id                                       | *        | yes       |          | -                                                                                |
| _Ref. `cartoCmpAppId.cartoAppId`_                            | _char(100)_                              |          |           |          | -                                                                                |
| _Ref. `cartoCmpAppId.cartoAppName`_                          | _char(100)_                              |          |           |          | -                                                                                |
| `cartoCmpName`                                               | char(100)                                | *        | yes       |          | -                                                                                |
| `cartoDescription`                                           | text(100)                                |          | yes       |          | -                                                                                |

`CartoCountry` business object definition
-----------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoCtyName`                                               | char(100)                                | *        | yes       |          | -                                                                                |

`CartoCtyApp` business object definition
----------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoCtyappCtyId` link to **`CartoCountry`**                | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `cartoCtyappCtyId.cartoCtyName`_                       | _char(100)_                              |          |           |          | -                                                                                |
| `cartoCtyappAppId` link to **`CartoApplication`**            | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `cartoCtyappAppId.cartoAppId`_                         | _char(100)_                              |          |           |          | -                                                                                |

`CartoFctAct` business object definition
----------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoFctactFctId` link to **`CartoFunction`**               | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `cartoFctactFctId.cartoFctName`_                       | _char(100)_                              |          |           |          | -                                                                                |
| `cartoFctactActId` link to **`CartoActivity`**               | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `cartoFctactActId.cartoActName`_                       | _char(100)_                              |          |           |          | -                                                                                |

`CartoFunction` business object definition
------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoFctName`                                               | char(100)                                | yes*     | yes       |          | -                                                                                |
| `cartoDescription`                                           | text(100)                                |          | yes       |          | -                                                                                |

`CartoItDomain` business object definition
------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoDomName`                                               | char(100)                                | yes*     | yes       |          | -                                                                                |
| `cartoDescription`                                           | text(100)                                |          | yes       |          | -                                                                                |

`CartoKeyData` business object definition
-----------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoKdName`                                                | char(100)                                | yes*     | yes       |          | -                                                                                |
| `cartoDescription`                                           | text(100)                                |          | yes       |          | -                                                                                |

`CartoServer` business object definition
----------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoSrvName`                                               | char(100)                                | yes*     | yes       |          | -                                                                                |
| `cartoSrvType`                                               | enum(100) using `CARTOSRVTYPE` list      |          | yes       |          | -                                                                                |
| `cartoSrvCategory`                                           | enum(10) using `CARTOSRVCATEGORY` list   |          | yes       |          | -                                                                                |

### Lists

* `CARTOSRVTYPE`
    - `BDD` Base de données
    - `PRES` Présentation
    - `APP` Application
* `CARTOSRVCATEGORY`
    - `PROD` Production
    - `DEV` Développement
    - `REC` Recette
    - `UAT` UAT

`CartoTechnology` business object definition
--------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `cartoTechName`                                              | char(100)                                | yes*     | yes       |          | -                                                                                |
| `cartoTechVersion`                                           | char(100)                                |          | yes       |          | -                                                                                |
| `cartoTechEos`                                               | date                                     |          | yes       |          | -                                                                                |
| `cartoDescription`                                           | text(100)                                |          | yes       |          | -                                                                                |

`CartoUser` business object definition
--------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `usr_login`                                                  | regexp(100)                              | yes*     | yes       | yes      | Login                                                                            |
| `usr_first_name`                                             | char(50)                                 |          | yes       | yes      | First name                                                                       |
| `usr_last_name`                                              | char(50)                                 |          | yes       | yes      | Last name                                                                        |
| `usr_email`                                                  | email(100)                               |          | yes       | yes      | Email address                                                                    |

