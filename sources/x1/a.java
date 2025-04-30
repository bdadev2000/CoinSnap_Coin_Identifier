package X1;

import W1.k;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.f;
import com.bumptech.glide.load.data.g;
import com.bumptech.glide.load.data.h;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3655a;

    public /* synthetic */ a(int i9) {
        this.f3655a = i9;
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class a() {
        switch (this.f3655a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public final g b(Object obj) {
        switch (this.f3655a) {
            case 0:
                return new k((ByteBuffer) obj);
            case 1:
                return new h(obj);
            default:
                return new h((ParcelFileDescriptor) obj);
        }
    }
}
