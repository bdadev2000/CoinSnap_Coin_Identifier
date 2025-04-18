package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.text.flatbuffer.MetadataList;

@AnyThread
@RequiresApi
/* loaded from: classes3.dex */
public final class MetadataRepo {

    /* renamed from: a, reason: collision with root package name */
    public final MetadataList f19552a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f19553b;

    /* renamed from: c, reason: collision with root package name */
    public final Node f19554c = new Node(1024);
    public final Typeface d;

    @RestrictTo
    /* loaded from: classes3.dex */
    public static class Node {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray f19555a;

        /* renamed from: b, reason: collision with root package name */
        public TypefaceEmojiRasterizer f19556b;

        public Node(int i2) {
            this.f19555a = new SparseArray(i2);
        }

        public final void a(TypefaceEmojiRasterizer typefaceEmojiRasterizer, int i2, int i3) {
            int a2 = typefaceEmojiRasterizer.a(i2);
            SparseArray sparseArray = this.f19555a;
            Node node = sparseArray == null ? null : (Node) sparseArray.get(a2);
            if (node == null) {
                node = new Node(1);
                sparseArray.put(typefaceEmojiRasterizer.a(i2), node);
            }
            if (i3 > i2) {
                node.a(typefaceEmojiRasterizer, i2 + 1, i3);
            } else {
                node.f19556b = typefaceEmojiRasterizer;
            }
        }
    }

    public MetadataRepo(Typeface typeface, MetadataList metadataList) {
        int i2;
        int i3;
        this.d = typeface;
        this.f19552a = metadataList;
        int a2 = metadataList.a(6);
        if (a2 != 0) {
            int i4 = a2 + metadataList.f19584a;
            i2 = metadataList.f19585b.getInt(metadataList.f19585b.getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        this.f19553b = new char[i2 * 2];
        int a3 = metadataList.a(6);
        if (a3 != 0) {
            int i5 = a3 + metadataList.f19584a;
            i3 = metadataList.f19585b.getInt(metadataList.f19585b.getInt(i5) + i5);
        } else {
            i3 = 0;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer = new TypefaceEmojiRasterizer(this, i6);
            MetadataItem c2 = typefaceEmojiRasterizer.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? c2.f19585b.getInt(a4 + c2.f19584a) : 0, this.f19553b, i6 * 2);
            Preconditions.a(typefaceEmojiRasterizer.b() > 0, "invalid metadata codepoint length");
            this.f19554c.a(typefaceEmojiRasterizer, 0, typefaceEmojiRasterizer.b() - 1);
        }
    }
}
