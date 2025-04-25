package com.glority.android.picturexx.adapter;

import android.net.Uri;
import com.glority.base.entity.BaseMultiEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddImageAdapter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/adapter/ImageEntity;", "Lcom/glority/base/entity/BaseMultiEntity;", "url", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUrl", "()Landroid/net/Uri;", "equals", "", "other", "", "hashCode", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class ImageEntity extends BaseMultiEntity {
    public static final int $stable = 8;
    private final Uri url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageEntity(Uri url) {
        super(0, null, 2, null);
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
    }

    public final Uri getUrl() {
        return this.url;
    }

    @Override // com.glority.base.entity.BaseMultiEntity
    public boolean equals(Object other) {
        if (super.equals(other)) {
            Uri uri = this.url;
            ImageEntity imageEntity = other instanceof ImageEntity ? (ImageEntity) other : null;
            if (Intrinsics.areEqual(uri, imageEntity != null ? imageEntity.url : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.glority.base.entity.BaseMultiEntity
    public int hashCode() {
        return (super.hashCode() * 31) + this.url.hashCode();
    }
}
