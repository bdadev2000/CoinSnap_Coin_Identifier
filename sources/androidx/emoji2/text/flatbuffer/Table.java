package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class Table {

    /* renamed from: a, reason: collision with root package name */
    public int f19584a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f19585b;

    /* renamed from: c, reason: collision with root package name */
    public int f19586c;
    public int d;

    /* renamed from: androidx.emoji2.text.flatbuffer.Table$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 implements Comparator<Integer> {
        @Override // java.util.Comparator
        public final int compare(Integer num, Integer num2) {
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.emoji2.text.flatbuffer.Utf8Safe, java.lang.Object] */
    public Table() {
        if (Utf8.f19587a == null) {
            Utf8.f19587a = new Object();
        }
    }

    public final int a(int i2) {
        if (i2 < this.d) {
            return this.f19585b.getShort(this.f19586c + i2);
        }
        return 0;
    }
}
