package c7;

import java.util.Comparator;

/* renamed from: c7.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0663y implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return com.facebook.appevents.n.a(Boolean.valueOf(((C0620c) obj2).isRequired()), Boolean.valueOf(((C0620c) obj).isRequired()));
    }
}
