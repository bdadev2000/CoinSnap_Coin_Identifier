package com.glority.android.livebus;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyRefDefinition.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0001\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u001a"}, d2 = {"anyKeyRef", "Lcom/glority/android/livebus/KeyRef;", "", "key", "", "booleanKeyRef", "", "byteArrayKeyRef", "", "byteKeyRef", "", "charKeyRef", "", "doubleKeyRef", "", "floatKeyRef", "", "intKeyRef", "", "keyRefOf", ExifInterface.GPS_DIRECTION_TRUE, "longKeyRef", "", "shortKeyRef", "", "stringKeyRef", "livebus_release"}, k = 2, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class KeyRefDefinitionKt {
    public static final KeyRef<Boolean> booleanKeyRef(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new BooleanKeyRef(key);
    }

    public static final KeyRef<Byte> byteKeyRef(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new ByteKeyRef(key);
    }

    public static final KeyRef<Short> shortKeyRef(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new ShortKeyRef(key);
    }

    public static final KeyRef<Integer> intKeyRef(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new IntKeyRef(key);
    }

    public static final KeyRef<Long> longKeyRef(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new LongKeyRef(key);
    }

    public static final KeyRef<Float> floatKeyRef(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new FloatKeyRef(key);
    }

    public static final KeyRef<Double> doubleKeyRef(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new DoubleKeyRef(key);
    }

    public static final KeyRef<Character> charKeyRef(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new CharKeyRef(key);
    }

    public static final KeyRef<String> stringKeyRef(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new StringKeyRef(key);
    }

    public static final KeyRef<Object> anyKeyRef(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new AnyKeyRef(key);
    }

    public static final KeyRef<byte[]> byteArrayKeyRef(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new ByteArrayKeyRef(key);
    }

    public static final <T> KeyRef<T> keyRefOf(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new ObjectKeyRef(key);
    }
}
