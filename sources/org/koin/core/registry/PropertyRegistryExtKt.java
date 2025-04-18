package org.koin.core.registry;

import b1.f0;
import e0.e0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Properties;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.error.NoPropertyFileFoundException;
import p0.a;

/* loaded from: classes2.dex */
public final class PropertyRegistryExtKt {
    public static final void loadEnvironmentProperties(@NotNull PropertyRegistry propertyRegistry) {
        a.s(propertyRegistry, "<this>");
        propertyRegistry.get_koin$koin_core().getLogger().debug("load properties from environment");
        Properties properties = System.getProperties();
        a.p(properties);
        saveProperties(propertyRegistry, properties);
        Map<String, String> map = System.getenv();
        a.r(map, "getenv(...)");
        Properties properties2 = new Properties();
        properties2.putAll(map);
        saveProperties(propertyRegistry, properties2);
    }

    public static final void loadPropertiesFromFile(@NotNull PropertyRegistry propertyRegistry, @NotNull String str) {
        a.s(propertyRegistry, "<this>");
        a.s(str, "fileName");
        propertyRegistry.get_koin$koin_core().getLogger().debug("load properties from ".concat(str));
        URL resource = Koin.class.getResource(str);
        String str2 = null;
        if (resource != null) {
            Charset charset = z0.a.f31458a;
            InputStream openStream = resource.openStream();
            try {
                a.p(openStream);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, openStream.available()));
                f0.i(openStream, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                a.r(byteArray, "toByteArray(...)");
                q.b(openStream, null);
                str2 = new String(byteArray, charset);
            } finally {
            }
        }
        if (str2 == null) {
            throw new NoPropertyFileFoundException("No properties found for file '" + str + '\'');
        }
        propertyRegistry.get_koin$koin_core().getLogger().info("loaded properties from file:'" + str + '\'');
        saveProperties(propertyRegistry, readDataFromFile(str2));
    }

    private static final Properties readDataFromFile(String str) {
        Properties properties = new Properties();
        byte[] bytes = str.getBytes(z0.a.f31458a);
        a.r(bytes, "getBytes(...)");
        properties.load(new ByteArrayInputStream(bytes));
        return properties;
    }

    public static final void saveProperties(@NotNull PropertyRegistry propertyRegistry, @NotNull Properties properties) {
        a.s(propertyRegistry, "<this>");
        a.s(properties, "properties");
        propertyRegistry.get_koin$koin_core().getLogger().debug("load " + properties.size() + " properties");
        for (Map.Entry entry : e0.x(properties).entrySet()) {
            propertyRegistry.saveProperty$koin_core((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
