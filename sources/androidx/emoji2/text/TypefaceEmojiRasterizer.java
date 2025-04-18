package androidx.emoji2.text;

import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.text.flatbuffer.MetadataList;
import androidx.emoji2.text.flatbuffer.Table;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

@AnyThread
@RequiresApi
/* loaded from: classes2.dex */
public class TypefaceEmojiRasterizer {
    public static final ThreadLocal d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f19561a;

    /* renamed from: b, reason: collision with root package name */
    public final MetadataRepo f19562b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f19563c = 0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface HasGlyph {
    }

    public TypefaceEmojiRasterizer(MetadataRepo metadataRepo, int i2) {
        this.f19562b = metadataRepo;
        this.f19561a = i2;
    }

    public final int a(int i2) {
        MetadataItem c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = c2.f19585b;
        int i3 = a2 + c2.f19584a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    public final int b() {
        MetadataItem c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        int i2 = a2 + c2.f19584a;
        return c2.f19585b.getInt(c2.f19585b.getInt(i2) + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.emoji2.text.flatbuffer.Table, java.lang.Object] */
    public final MetadataItem c() {
        ThreadLocal threadLocal = d;
        MetadataItem metadataItem = (MetadataItem) threadLocal.get();
        MetadataItem metadataItem2 = metadataItem;
        if (metadataItem == null) {
            ?? table = new Table();
            threadLocal.set(table);
            metadataItem2 = table;
        }
        MetadataList metadataList = this.f19562b.f19552a;
        int a2 = metadataList.a(6);
        if (a2 != 0) {
            int i2 = a2 + metadataList.f19584a;
            int i3 = (this.f19561a * 4) + metadataList.f19585b.getInt(i2) + i2 + 4;
            int i4 = metadataList.f19585b.getInt(i3) + i3;
            ByteBuffer byteBuffer = metadataList.f19585b;
            metadataItem2.f19585b = byteBuffer;
            if (byteBuffer != null) {
                metadataItem2.f19584a = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                metadataItem2.f19586c = i5;
                metadataItem2.d = metadataItem2.f19585b.getShort(i5);
            } else {
                metadataItem2.f19584a = 0;
                metadataItem2.f19586c = 0;
                metadataItem2.d = 0;
            }
        }
        return metadataItem2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        MetadataItem c2 = c();
        int a2 = c2.a(4);
        sb.append(Integer.toHexString(a2 != 0 ? c2.f19585b.getInt(a2 + c2.f19584a) : 0));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i2 = 0; i2 < b2; i2++) {
            sb.append(Integer.toHexString(a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
