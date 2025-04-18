package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nutfEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utfEncoding.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/UtfEncodingKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n37#2,2:74\n1#3:76\n*S KotlinDebug\n*F\n+ 1 utfEncoding.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/UtfEncodingKt\n*L\n55#1:74,2\n*E\n"})
/* loaded from: classes4.dex */
public final class UtfEncodingKt {
    public static final byte[] stringsToBytes(String[] strings) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        int i10 = 0;
        for (String str : strings) {
            i10 += str.length();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (String str2 : strings) {
            int length = str2.length();
            int i12 = 0;
            while (i12 < length) {
                bArr[i11] = (byte) str2.charAt(i12);
                i12++;
                i11++;
            }
        }
        return bArr;
    }
}
