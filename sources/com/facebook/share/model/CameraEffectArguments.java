package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import e0.y;
import java.util.Set;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes.dex */
public final class CameraEffectArguments implements ShareModel {

    @Nullable
    private final Bundle params;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new Parcelable.Creator<CameraEffectArguments>() { // from class: com.facebook.share.model.CameraEffectArguments$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CameraEffectArguments createFromParcel(@NotNull Parcel parcel) {
            a.s(parcel, "parcel");
            return new CameraEffectArguments(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CameraEffectArguments[] newArray(int i2) {
            return new CameraEffectArguments[i2];
        }
    };

    /* loaded from: classes.dex */
    public static final class Builder implements ShareModelBuilder<CameraEffectArguments, Builder> {

        @NotNull
        private final Bundle params = new Bundle();

        @NotNull
        public final Bundle getParams$facebook_common_release() {
            return this.params;
        }

        @NotNull
        public final Builder putArgument(@NotNull String str, @NotNull String str2) {
            a.s(str, SDKConstants.PARAM_KEY);
            a.s(str2, "value");
            this.params.putString(str, str2);
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public CameraEffectArguments build() {
            return new CameraEffectArguments(this, null);
        }

        @NotNull
        public final Builder putArgument(@NotNull String str, @NotNull String[] strArr) {
            a.s(str, SDKConstants.PARAM_KEY);
            a.s(strArr, "arrayValue");
            this.params.putStringArray(str, strArr);
            return this;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable CameraEffectArguments cameraEffectArguments) {
            if (cameraEffectArguments != null) {
                this.params.putAll(cameraEffectArguments.params);
            }
            return this;
        }

        @NotNull
        public final Builder readFrom(@NotNull Parcel parcel) {
            a.s(parcel, "parcel");
            return readFrom((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ CameraEffectArguments(Builder builder, k kVar) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Object get(@Nullable String str) {
        Bundle bundle = this.params;
        if (bundle == null) {
            return null;
        }
        return bundle.get(str);
    }

    @Nullable
    public final String getString(@Nullable String str) {
        Bundle bundle = this.params;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str);
    }

    @Nullable
    public final String[] getStringArray(@Nullable String str) {
        Bundle bundle = this.params;
        if (bundle == null) {
            return null;
        }
        return bundle.getStringArray(str);
    }

    @NotNull
    public final Set<String> keySet() {
        Bundle bundle = this.params;
        Set<String> keySet = bundle == null ? null : bundle.keySet();
        return keySet == null ? y.f30220a : keySet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        a.s(parcel, "out");
        parcel.writeBundle(this.params);
    }

    private CameraEffectArguments(Builder builder) {
        this.params = builder.getParams$facebook_common_release();
    }

    public CameraEffectArguments(@NotNull Parcel parcel) {
        a.s(parcel, "parcel");
        this.params = parcel.readBundle(CameraEffectArguments.class.getClassLoader());
    }
}
