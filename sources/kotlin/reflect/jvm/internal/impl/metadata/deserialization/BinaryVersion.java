package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import a4.j;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,101:1\n5306#2,7:102\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n*L\n73#1:102,7\n*E\n"})
/* loaded from: classes4.dex */
public abstract class BinaryVersion {
    public static final Companion Companion = new Companion(null);
    private final int major;
    private final int minor;
    private final int[] numbers;
    private final int patch;
    private final List<Integer> rest;

    @SourceDebugExtension({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n1549#2:102\n1620#2,3:103\n37#3,2:106\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n*L\n97#1:102\n97#1:103,3\n98#1:106,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BinaryVersion(int... numbers) {
        int i10;
        int i11;
        List<Integer> emptyList;
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.numbers = numbers;
        Integer orNull = ArraysKt.getOrNull(numbers, 0);
        if (orNull != null) {
            i10 = orNull.intValue();
        } else {
            i10 = -1;
        }
        this.major = i10;
        Integer orNull2 = ArraysKt.getOrNull(numbers, 1);
        if (orNull2 != null) {
            i11 = orNull2.intValue();
        } else {
            i11 = -1;
        }
        this.minor = i11;
        Integer orNull3 = ArraysKt.getOrNull(numbers, 2);
        this.patch = orNull3 != null ? orNull3.intValue() : -1;
        if (numbers.length > 3) {
            if (numbers.length <= 1024) {
                emptyList = CollectionsKt.toList(ArraysKt.asList(numbers).subList(3, numbers.length));
            } else {
                throw new IllegalArgumentException(j.i(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        this.rest = emptyList;
    }

    public boolean equals(Object obj) {
        if (obj != null && Intrinsics.areEqual(getClass(), obj.getClass())) {
            BinaryVersion binaryVersion = (BinaryVersion) obj;
            if (this.major == binaryVersion.major && this.minor == binaryVersion.minor && this.patch == binaryVersion.patch && Intrinsics.areEqual(this.rest, binaryVersion.rest)) {
                return true;
            }
        }
        return false;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public int hashCode() {
        int i10 = this.major;
        int i11 = (i10 * 31) + this.minor + i10;
        int i12 = (i11 * 31) + this.patch + i11;
        return this.rest.hashCode() + (i12 * 31) + i12;
    }

    public final boolean isAtLeast(BinaryVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return isAtLeast(version.major, version.minor, version.patch);
    }

    public final boolean isAtMost(int i10, int i11, int i12) {
        int i13 = this.major;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.minor;
        if (i14 < i11) {
            return true;
        }
        if (i14 <= i11 && this.patch <= i12) {
            return true;
        }
        return false;
    }

    public final boolean isCompatibleTo(BinaryVersion ourVersion) {
        Intrinsics.checkNotNullParameter(ourVersion, "ourVersion");
        int i10 = this.major;
        if (i10 == 0) {
            if (ourVersion.major == 0 && this.minor == ourVersion.minor) {
                return true;
            }
        } else if (i10 == ourVersion.major && this.minor <= ourVersion.minor) {
            return true;
        }
        return false;
    }

    public final int[] toArray() {
        return this.numbers;
    }

    public String toString() {
        String joinToString$default;
        boolean z10;
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        for (int i10 : array) {
            if (i10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        if (arrayList.isEmpty()) {
            return AppLovinMediationProvider.UNKNOWN;
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ".", null, null, 0, null, null, 62, null);
        return joinToString$default;
    }

    public final boolean isAtLeast(int i10, int i11, int i12) {
        int i13 = this.major;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.minor;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.patch >= i12;
    }
}
