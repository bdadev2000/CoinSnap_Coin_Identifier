package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@SourceDebugExtension({"SMAP\ncapitalizeDecapitalize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 capitalizeDecapitalize.kt\norg/jetbrains/kotlin/util/capitalizeDecapitalize/CapitalizeDecapitalizeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1#2:145\n288#3,2:146\n288#3,2:148\n766#3:150\n857#3,2:151\n1864#3,3:153\n*S KotlinDebug\n*F\n+ 1 capitalizeDecapitalize.kt\norg/jetbrains/kotlin/util/capitalizeDecapitalize/CapitalizeDecapitalizeKt\n*L\n34#1:146,2\n57#1:148,2\n72#1:150\n72#1:151,2\n78#1:153,3\n*E\n"})
/* loaded from: classes4.dex */
public final class CapitalizeDecapitalizeKt {
    public static final String capitalizeAsciiOnly(String str) {
        boolean z10;
        Intrinsics.checkNotNullParameter(str, "<this>");
        boolean z11 = false;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z11 = true;
        }
        if (z11) {
            char upperCase = Character.toUpperCase(charAt);
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return upperCase + substring;
        }
        return str;
    }

    public static final String decapitalizeAsciiOnly(String str) {
        boolean z10;
        Intrinsics.checkNotNullParameter(str, "<this>");
        boolean z11 = false;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && charAt < '[') {
            z11 = true;
        }
        if (z11) {
            char lowerCase = Character.toLowerCase(charAt);
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return lowerCase + substring;
        }
        return str;
    }

    public static final String decapitalizeSmartForCompiler(String str, boolean z10) {
        boolean z11;
        boolean z12;
        Integer num;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && isUpperCaseCharAt(str, 0, z10)) {
            if (str.length() != 1 && isUpperCaseCharAt(str, 1, z10)) {
                Iterator<Integer> it = StringsKt.getIndices(str).iterator();
                while (true) {
                    if (it.hasNext()) {
                        num = it.next();
                        if (!isUpperCaseCharAt(str, num.intValue(), z10)) {
                            break;
                        }
                    } else {
                        num = null;
                        break;
                    }
                }
                Integer num2 = num;
                if (num2 != null) {
                    int intValue = num2.intValue() - 1;
                    StringBuilder sb2 = new StringBuilder();
                    String substring = str.substring(0, intValue);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(toLowerCase(substring, z10));
                    String substring2 = str.substring(intValue);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                    sb2.append(substring2);
                    return sb2.toString();
                }
                return toLowerCase(str, z10);
            }
            if (z10) {
                return decapitalizeAsciiOnly(str);
            }
            if (str.length() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                char lowerCase = Character.toLowerCase(str.charAt(0));
                String substring3 = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
                return lowerCase + substring3;
            }
            return str;
        }
        return str;
    }

    private static final boolean isUpperCaseCharAt(String str, int i10, boolean z10) {
        char charAt = str.charAt(i10);
        if (z10) {
            if ('A' > charAt || charAt >= '[') {
                return false;
            }
            return true;
        }
        return Character.isUpperCase(charAt);
    }

    private static final String toLowerCase(String str, boolean z10) {
        if (z10) {
            return toLowerCaseAsciiOnly(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public static final String toLowerCaseAsciiOnly(String str) {
        boolean z10;
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if ('A' <= charAt && charAt < '[') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                charAt = Character.toLowerCase(charAt);
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "builder.toString()");
        return sb3;
    }
}
