package kotlin.text;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"kotlin/text/StringsKt__AppendableKt", "kotlin/text/StringsKt__IndentKt", "kotlin/text/StringsKt__RegexExtensionsJVMKt", "kotlin/text/StringsKt__RegexExtensionsKt", "kotlin/text/StringsKt__StringBuilderJVMKt", "kotlin/text/StringsKt__StringBuilderKt", "kotlin/text/StringsKt__StringNumberConversionsJVMKt", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/StringsKt__StringsJVMKt", "kotlin/text/StringsKt__StringsKt", "kotlin/text/StringsKt___StringsJvmKt", "kotlin/text/StringsKt___StringsKt"}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes4.dex */
public final class StringsKt extends StringsKt___StringsKt {
    private StringsKt() {
    }

    public static /* bridge */ /* synthetic */ boolean A(String str, String str2, int i10) {
        return StringsKt__StringsJVMKt.startsWith$default(str, str2, i10, false, 4, null);
    }

    public static /* bridge */ /* synthetic */ void a(StringBuilder sb2, String... strArr) {
        StringsKt__StringBuilderKt.append(sb2, strArr);
    }

    public static /* bridge */ /* synthetic */ boolean c(CharSequence charSequence, char c10) {
        return StringsKt__StringsKt.contains$default(charSequence, c10, false, 2, (Object) null);
    }

    public static /* bridge */ /* synthetic */ boolean d(CharSequence charSequence, CharSequence charSequence2) {
        return StringsKt__StringsKt.contains$default(charSequence, charSequence2, false, 2, (Object) null);
    }

    public static /* bridge */ /* synthetic */ boolean h(String str, String str2) {
        return StringsKt__StringsJVMKt.endsWith$default(str, str2, false, 2, null);
    }

    public static /* bridge */ /* synthetic */ boolean i(String str, String str2) {
        return StringsKt__StringsJVMKt.equals(str, str2, true);
    }

    public static /* bridge */ /* synthetic */ int j(CharSequence charSequence, char c10, int i10, int i11) {
        return StringsKt__StringsKt.indexOf$default(charSequence, c10, i10, false, i11, (Object) null);
    }

    public static /* bridge */ /* synthetic */ String p(String str) {
        return StringsKt__StringsKt.removeSuffix(str, (CharSequence) "Client");
    }

    public static /* bridge */ /* synthetic */ String s(String str, String str2, String str3) {
        return StringsKt__StringsJVMKt.replace$default(str, str2, str3, false, 4, (Object) null);
    }

    public static /* bridge */ /* synthetic */ List v(CharSequence charSequence, String[] strArr, int i10, int i11) {
        return StringsKt__StringsKt.split$default(charSequence, strArr, false, i10, i11, (Object) null);
    }

    public static /* bridge */ /* synthetic */ boolean w(String str, String str2) {
        return StringsKt__StringsJVMKt.startsWith(str, str2, true);
    }

    public static /* bridge */ /* synthetic */ boolean z(String str, String str2) {
        return StringsKt__StringsJVMKt.startsWith$default(str, str2, false, 2, null);
    }
}
