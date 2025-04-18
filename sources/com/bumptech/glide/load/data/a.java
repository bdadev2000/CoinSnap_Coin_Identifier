package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9689g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ContentResolver contentResolver, Uri uri, int i10) {
        super(contentResolver, uri, 1);
        this.f9689g = i10;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f9689g) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final void c(Object obj) {
        switch (this.f9689g) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((ParcelFileDescriptor) obj).close();
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final Object g(ContentResolver contentResolver, Uri uri) {
        switch (this.f9689g) {
            case 0:
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, CampaignEx.JSON_KEY_AD_R);
                if (openAssetFileDescriptor != null) {
                    return openAssetFileDescriptor;
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
            default:
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, CampaignEx.JSON_KEY_AD_R);
                if (openAssetFileDescriptor2 != null) {
                    return openAssetFileDescriptor2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
        }
    }
}
