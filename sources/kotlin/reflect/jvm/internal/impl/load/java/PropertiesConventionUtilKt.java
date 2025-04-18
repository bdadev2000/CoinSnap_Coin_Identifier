package kotlin.reflect.jvm.internal.impl.load.java;

import eb.j;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

@SourceDebugExtension({"SMAP\npropertiesConventionUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 propertiesConventionUtil.kt\norg/jetbrains/kotlin/load/java/PropertiesConventionUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n766#2:103\n857#2,2:104\n*S KotlinDebug\n*F\n+ 1 propertiesConventionUtil.kt\norg/jetbrains/kotlin/load/java/PropertiesConventionUtilKt\n*L\n90#1:103\n90#1:104,2\n*E\n"})
/* loaded from: classes4.dex */
public final class PropertiesConventionUtilKt {
    public static final List<Name> getPropertyNamesCandidatesByAccessorName(Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String asString = name.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "name.asString()");
        if (JvmAbi.isGetterName(asString)) {
            return CollectionsKt.listOfNotNull(propertyNameByGetMethodName(name));
        }
        if (JvmAbi.isSetterName(asString)) {
            return propertyNamesBySetMethodName(name);
        }
        return BuiltinSpecialProperties.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(name);
    }

    public static final Name propertyNameByGetMethodName(Name methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Name propertyNameFromAccessorMethodName$default = propertyNameFromAccessorMethodName$default(methodName, "get", false, null, 12, null);
        if (propertyNameFromAccessorMethodName$default == null) {
            return propertyNameFromAccessorMethodName$default(methodName, "is", false, null, 8, null);
        }
        return propertyNameFromAccessorMethodName$default;
    }

    public static final Name propertyNameBySetMethodName(Name methodName, boolean z10) {
        String str;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        if (z10) {
            str = "is";
        } else {
            str = null;
        }
        return propertyNameFromAccessorMethodName$default(methodName, "set", false, str, 4, null);
    }

    private static final Name propertyNameFromAccessorMethodName(Name name, String str, boolean z10, String str2) {
        boolean startsWith$default;
        boolean z11;
        if (name.isSpecial()) {
            return null;
        }
        String identifier = name.getIdentifier();
        Intrinsics.checkNotNullExpressionValue(identifier, "methodName.identifier");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(identifier, str, false, 2, null);
        if (!startsWith$default || identifier.length() == str.length()) {
            return null;
        }
        char charAt = identifier.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return null;
        }
        if (str2 != null) {
            StringBuilder m10 = j.m(str2);
            m10.append(StringsKt.removePrefix(identifier, (CharSequence) str));
            return Name.identifier(m10.toString());
        }
        if (!z10) {
            return name;
        }
        String decapitalizeSmartForCompiler = CapitalizeDecapitalizeKt.decapitalizeSmartForCompiler(StringsKt.removePrefix(identifier, (CharSequence) str), true);
        if (!Name.isValidIdentifier(decapitalizeSmartForCompiler)) {
            return null;
        }
        return Name.identifier(decapitalizeSmartForCompiler);
    }

    public static /* synthetic */ Name propertyNameFromAccessorMethodName$default(Name name, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return propertyNameFromAccessorMethodName(name, str, z10, str2);
    }

    public static final List<Name> propertyNamesBySetMethodName(Name methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return CollectionsKt.listOfNotNull((Object[]) new Name[]{propertyNameBySetMethodName(methodName, false), propertyNameBySetMethodName(methodName, true)});
    }
}
