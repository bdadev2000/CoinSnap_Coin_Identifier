package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\u001a_\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00070\u0007H\u0001¢\u0006\u0002\u0010\u000b\u001a9\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"createMarkedEnumSerializer", "Lkotlinx/serialization/KSerializer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "serialName", "", "values", "", "names", "annotations", "", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;", "createSimpleEnumSerializer", "(Ljava/lang/String;[Ljava/lang/Enum;)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class EnumsKt {
    @InternalSerializationApi
    public static final <T extends Enum<T>> KSerializer<T> createMarkedEnumSerializer(String serialName, T[] values, String[] names, Annotation[][] annotations) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        EnumDescriptor enumDescriptor = new EnumDescriptor(serialName, values.length);
        int length = values.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t5 = values[i10];
            int i12 = i11 + 1;
            String str = (String) ArraysKt.getOrNull(names, i11);
            if (str == null) {
                str = t5.name();
            }
            PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor, str, false, 2, null);
            Annotation[] annotationArr = (Annotation[]) ArraysKt.getOrNull(annotations, i11);
            if (annotationArr != null) {
                for (Annotation annotation : annotationArr) {
                    enumDescriptor.pushAnnotation(annotation);
                }
            }
            i10++;
            i11 = i12;
        }
        return new EnumSerializer(serialName, values, enumDescriptor);
    }

    @InternalSerializationApi
    public static final <T extends Enum<T>> KSerializer<T> createSimpleEnumSerializer(String serialName, T[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        return new EnumSerializer(serialName, values);
    }
}
