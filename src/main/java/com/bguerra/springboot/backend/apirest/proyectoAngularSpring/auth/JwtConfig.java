package com.bguerra.springboot.backend.apirest.proyectoAngularSpring.auth;

public class JwtConfig {
    public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";

    public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEogIBAAKCAQEAmHkMXQANzuY4OH6mc+SMRYP0xm3cEAlAEKNzFzPl+Akxgj50\n" +
            "Wjp8Q9NfWw4s6gUwkPPSsR6xXUDBdxt8Sf6g0bNfRNb7dDMad7bdfTcwDWxXlt/B\n" +
            "nVcsEbXOlmVpPs6uH6BMqaaME6uq8EK84Va/b6TcGqsHey2dF2nvaK5g7e7833AF\n" +
            "XosaaW2YNpr25Da48hTenZVaOpyYhsfnCfizR4lT7h1L3RV2RrnZz+BleLARcyZ6\n" +
            "qyMv96P7g8U5B2M5W/tBSUFhBNlRVkx20ts9Ye2WYysPxiaK9xJv8UmpTZuUVzm5\n" +
            "4RlIsiUfIbt9NcZfIqaQX/gLg469C0SM35P84QIDAQABAoIBAFMW1BfyKZQwfT68\n" +
            "NfU9/Pr89+0SfTP39oOaruNcEtxiFirF4h4xdPp5O6OhS/STs22qkYyYD0ukOEmy\n" +
            "Hr8sFXNxbl9TUGB4YNoQOw87feIywmCjux0FHizgiJ4I0Zu6gcUWU/C3o+osSND5\n" +
            "bXjXDyfGDXQy87a6mrrhree773J5TNvl1wn20q251vM6/rdjwAYc2iJYdTj5+TFa\n" +
            "lFc26RiLcwiKFjaFAaz2Orm0bT+c/EzSY6gQb3Rx3Sq5y0MQNPlMQVSoug89Glf5\n" +
            "2RIKQKRDbs2NscYADk4GHI90P2VLpt+f1WKt6/R6F8jBRqMbW/oexrWbU2zCWOBs\n" +
            "Hm/WAAECgYEAxb3wkJS/eBIES7OnmskoVE3Dk/1v+2tXBr12k2Tq95lLxi5U9ko3\n" +
            "lySu1CZSVeG06gKrk4Sf8pX86yPtxgh51kw9i6f5WBmD4VUOaCMrArnmTt0ZCZFK\n" +
            "tAJjm7NAKqKov8HBRb3+pvw2aknkSRduw1AnCytoHVvpkDyQ7m15uOECgYEAxWTU\n" +
            "YGsFN7vyYD6jscLfFpGAlab3ObnnAdtL+0dFq6DKDPfJJWK7SqAZ575KgJY0iso/\n" +
            "dkO+Sy5Kip08fX97VA4cvTUOwcT2Q1cSRHKQZeebyzyjI6QFr0IuVI29dtuctk+p\n" +
            "tI9YvtpnNsPn5SqzMcDJodFFIaKfPhOxuGxOxAECgYA2lQlUP1rin8aDxuFavm/d\n" +
            "ZWG49dn1QlnRSHb0lISvN6dM2vkkyrOxirSfZryPbC/t8DLAE3m7El+v4Ej/wtMu\n" +
            "rfjHFeSjxtc6WaoSYLK8m+fQmQMSOwKt0YMBNWde3WtLEwZwY9No8HFswVy8ODWg\n" +
            "v/0m/iJNCFPeNnmi9qEEwQKBgB0Kipxs4mWixzQVwyuiCgRd/9cEq5bYnP4O74zW\n" +
            "nY90poVl5zgS4I9IIsePnZJxhuVsgA28RcD13I2sOHwWR2TEdsH3jmY/viOGKe/c\n" +
            "ExaLDsbF8xKJTTTNvdc+y0MzaEkCS2t/M4VQyKKsC/ARai/Ft2SRT2R1coxFhX4m\n" +
            "oSgBAoGANPIxlSg3ca8zOKf2f5kt3miK9gApKFyca0PCJdNd5wB3XWKDiw+CnBLL\n" +
            "4MX7hiVq+G1o+kY1qFz6fKEnbkqD+Fy3OjRzG5auBHVQhYgS7+COC/iSA0KgNWRR\n" +
            "Yc/RsdYJ+B1gtFtYU4qJ07kI4IGFxnx0laezkWkknu42QzTUskY=\n" +
            "-----END RSA PRIVATE KEY-----";

    public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmHkMXQANzuY4OH6mc+SM\n" +
            "RYP0xm3cEAlAEKNzFzPl+Akxgj50Wjp8Q9NfWw4s6gUwkPPSsR6xXUDBdxt8Sf6g\n" +
            "0bNfRNb7dDMad7bdfTcwDWxXlt/BnVcsEbXOlmVpPs6uH6BMqaaME6uq8EK84Va/\n" +
            "b6TcGqsHey2dF2nvaK5g7e7833AFXosaaW2YNpr25Da48hTenZVaOpyYhsfnCfiz\n" +
            "R4lT7h1L3RV2RrnZz+BleLARcyZ6qyMv96P7g8U5B2M5W/tBSUFhBNlRVkx20ts9\n" +
            "Ye2WYysPxiaK9xJv8UmpTZuUVzm54RlIsiUfIbt9NcZfIqaQX/gLg469C0SM35P8\n" +
            "4QIDAQAB\n" +
            "-----END PUBLIC KEY-----";
}
