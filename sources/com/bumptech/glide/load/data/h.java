package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class h implements f {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i10) {
        this.a = i10;
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class a() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public final g b(Object obj) {
        switch (this.a) {
            case 0:
                return new n(obj);
            case 1:
                return new n((ParcelFileDescriptor) obj);
            default:
                return new fb.c((ByteBuffer) obj, 18);
        }
    }
}
