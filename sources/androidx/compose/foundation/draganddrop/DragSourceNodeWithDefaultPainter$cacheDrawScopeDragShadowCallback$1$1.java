package androidx.compose.foundation.draganddrop;

import android.graphics.Picture;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.internal.o;
import q0.l;

/* loaded from: classes3.dex */
final /* synthetic */ class DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1 extends o implements l {
    @Override // q0.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
        CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = (CacheDrawScopeDragShadowCallback) this.receiver;
        cacheDrawScopeDragShadowCallback.getClass();
        Picture picture = new Picture();
        cacheDrawScopeDragShadowCallback.f2990a = picture;
        return cacheDrawScope.n(new CacheDrawScopeDragShadowCallback$cachePicture$1$1(picture, (int) Size.d(cacheDrawScope.f14796a.b()), (int) Size.b(cacheDrawScope.f14796a.b())));
    }
}
