package e4;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;
import n4.w;

/* loaded from: classes.dex */
public final class g implements i, h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.load.data.n f17101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h4.h f17102c;

    public /* synthetic */ g(com.bumptech.glide.load.data.n nVar, h4.h hVar) {
        this.f17101b = nVar;
        this.f17102c = hVar;
    }

    @Override // e4.h
    public final int j(f fVar) {
        w wVar;
        h4.h hVar = this.f17102c;
        com.bumptech.glide.load.data.n nVar = this.f17101b;
        try {
            wVar = new w(new FileInputStream(nVar.a().getFileDescriptor()), hVar);
        } catch (Throwable th2) {
            th = th2;
            wVar = null;
        }
        try {
            int a = fVar.a(wVar, hVar);
            wVar.release();
            nVar.a();
            return a;
        } catch (Throwable th3) {
            th = th3;
            if (wVar != null) {
                wVar.release();
            }
            nVar.a();
            throw th;
        }
    }

    @Override // e4.i
    public final ImageHeaderParser$ImageType n(f fVar) {
        w wVar;
        com.bumptech.glide.load.data.n nVar = this.f17101b;
        try {
            wVar = new w(new FileInputStream(nVar.a().getFileDescriptor()), this.f17102c);
        } catch (Throwable th2) {
            th = th2;
            wVar = null;
        }
        try {
            ImageHeaderParser$ImageType c10 = fVar.c(wVar);
            wVar.release();
            nVar.a();
            return c10;
        } catch (Throwable th3) {
            th = th3;
            if (wVar != null) {
                wVar.release();
            }
            nVar.a();
            throw th;
        }
    }
}
