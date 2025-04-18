package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;

/* loaded from: classes4.dex */
public final class DeserializationHelpersKt {
    public static final JvmMetadataVersion jvmMetadataVersionOrDefault(DeserializationConfiguration deserializationConfiguration) {
        JvmMetadataVersion jvmMetadataVersion;
        Intrinsics.checkNotNullParameter(deserializationConfiguration, "<this>");
        BinaryVersion binaryVersion = deserializationConfiguration.getBinaryVersion();
        if (binaryVersion instanceof JvmMetadataVersion) {
            jvmMetadataVersion = (JvmMetadataVersion) binaryVersion;
        } else {
            jvmMetadataVersion = null;
        }
        if (jvmMetadataVersion == null) {
            return JvmMetadataVersion.INSTANCE;
        }
        return jvmMetadataVersion;
    }
}
