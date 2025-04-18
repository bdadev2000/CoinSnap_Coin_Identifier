package androidx.navigation;

import android.os.Parcelable;
import androidx.navigation.NavArgument;
import androidx.navigation.NavType;
import java.io.Serializable;
import q0.l;

/* loaded from: classes3.dex */
public final class NamedNavArgumentKt {
    public static final NamedNavArgument a(String str, l lVar) {
        NavType serializableType;
        p0.a.s(str, "name");
        p0.a.s(lVar, "builder");
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        lVar.invoke(navArgumentBuilder);
        NavArgument.Builder builder = navArgumentBuilder.f20326a;
        NavType navType = builder.f20323a;
        if (navType == null) {
            Object obj = builder.f20325c;
            if (obj instanceof Integer) {
                navType = NavType.f20492b;
            } else if (obj instanceof int[]) {
                navType = NavType.f20493c;
            } else if (obj instanceof Long) {
                navType = NavType.e;
            } else if (obj instanceof long[]) {
                navType = NavType.f20494f;
            } else if (obj instanceof Float) {
                navType = NavType.f20496h;
            } else if (obj instanceof float[]) {
                navType = NavType.f20497i;
            } else if (obj instanceof Boolean) {
                navType = NavType.f20499k;
            } else if (obj instanceof boolean[]) {
                navType = NavType.f20500l;
            } else if ((obj instanceof String) || obj == null) {
                navType = NavType.f20502n;
            } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                navType = NavType.f20503o;
            } else {
                if (obj.getClass().isArray()) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    p0.a.p(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        p0.a.q(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        serializableType = new NavType.ParcelableArrayType(componentType2);
                        navType = serializableType;
                    }
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    p0.a.p(componentType3);
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        p0.a.q(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        serializableType = new NavType.SerializableArrayType(componentType4);
                        navType = serializableType;
                    }
                }
                if (obj instanceof Parcelable) {
                    serializableType = new NavType.ParcelableType(obj.getClass());
                } else if (obj instanceof Enum) {
                    serializableType = new NavType.EnumType(obj.getClass());
                } else {
                    if (!(obj instanceof Serializable)) {
                        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    serializableType = new NavType.SerializableType(obj.getClass());
                }
                navType = serializableType;
            }
        }
        return new NamedNavArgument(str, new NavArgument(navType, builder.f20324b, builder.f20325c, builder.d, builder.e));
    }
}
