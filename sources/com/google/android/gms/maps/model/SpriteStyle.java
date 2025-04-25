package com.google.android.gms.maps.model;

import com.google.android.gms.maps.model.StampStyle;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public class SpriteStyle extends StampStyle {

    /* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
    /* loaded from: classes12.dex */
    public static final class Builder extends StampStyle.Builder<Builder> {
        private Builder() {
            throw null;
        }

        /* synthetic */ Builder(zzv zzvVar) {
        }

        public SpriteStyle build() {
            return new SpriteStyle(this.zza);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        protected Builder self() {
            return this;
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        protected final /* bridge */ /* synthetic */ Builder self() {
            return this;
        }
    }

    public SpriteStyle(BitmapDescriptor bitmapDescriptor) {
        super(bitmapDescriptor);
    }

    public static Builder newBuilder(BitmapDescriptor bitmapDescriptor) {
        return new Builder(null).stamp(bitmapDescriptor);
    }
}
