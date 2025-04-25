package com.google.android.gms.maps.model;

import com.google.android.gms.maps.model.StampStyle;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public class TextureStyle extends StampStyle {

    /* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
    /* loaded from: classes12.dex */
    public static final class Builder extends StampStyle.Builder<Builder> {
        private Builder() {
            throw null;
        }

        /* synthetic */ Builder(zzaf zzafVar) {
        }

        public TextureStyle build() {
            return new TextureStyle(this.zza, null);
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        protected final /* bridge */ /* synthetic */ Builder self() {
            return this;
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        /* renamed from: self, reason: avoid collision after fix types in other method */
        protected Builder self2() {
            return this;
        }
    }

    /* synthetic */ TextureStyle(BitmapDescriptor bitmapDescriptor, zzag zzagVar) {
        super(bitmapDescriptor);
    }

    public static Builder newBuilder(BitmapDescriptor bitmapDescriptor) {
        return new Builder(null).stamp(bitmapDescriptor);
    }
}
