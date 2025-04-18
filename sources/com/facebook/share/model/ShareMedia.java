package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia.Builder;
import e0.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@RestrictTo
/* loaded from: classes2.dex */
public abstract class ShareMedia<M extends ShareMedia<M, B>, B extends Builder<M, B>> implements ShareModel {

    @NotNull
    private final Bundle params;

    /* loaded from: classes2.dex */
    public static abstract class Builder<M extends ShareMedia<M, B>, B extends Builder<M, B>> implements ShareModelBuilder<M, B> {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private Bundle params = new Bundle();

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            @NotNull
            public final List<ShareMedia<?, ?>> readListFrom$facebook_common_release(@NotNull Parcel parcel) {
                a.s(parcel, "parcel");
                Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
                if (readParcelableArray == null) {
                    return w.f30218a;
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : readParcelableArray) {
                    if (parcelable instanceof ShareMedia) {
                        arrayList.add(parcelable);
                    }
                }
                return arrayList;
            }

            public final void writeListTo$facebook_common_release(@NotNull Parcel parcel, int i2, @NotNull List<? extends ShareMedia<?, ?>> list) {
                a.s(parcel, "out");
                a.s(list, ShareConstants.WEB_DIALOG_PARAM_MEDIA);
                Object[] array = list.toArray(new ShareMedia[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                parcel.writeParcelableArray((Parcelable[]) array, i2);
            }
        }

        @NotNull
        public final Bundle getParams$facebook_common_release() {
            return this.params;
        }

        @d0.a
        @NotNull
        public final B setParameter(@NotNull String str, @NotNull String str2) {
            a.s(str, SDKConstants.PARAM_KEY);
            a.s(str2, "value");
            this.params.putString(str, str2);
            return this;
        }

        @d0.a
        @NotNull
        public final B setParameters(@NotNull Bundle bundle) {
            a.s(bundle, "parameters");
            this.params.putAll(bundle);
            return this;
        }

        public final void setParams$facebook_common_release(@NotNull Bundle bundle) {
            a.s(bundle, "<set-?>");
            this.params = bundle;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public B readFrom(@Nullable M m2) {
            return m2 == null ? this : setParameters(((ShareMedia) m2).params);
        }
    }

    /* loaded from: classes2.dex */
    public enum Type {
        PHOTO,
        VIDEO;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            Type[] valuesCustom = values();
            return (Type[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public ShareMedia(@NotNull Builder<M, B> builder) {
        a.s(builder, "builder");
        this.params = new Bundle(builder.getParams$facebook_common_release());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public abstract Type getMediaType();

    @d0.a
    @NotNull
    public final Bundle getParameters() {
        return new Bundle(this.params);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        a.s(parcel, "dest");
        parcel.writeBundle(this.params);
    }

    public ShareMedia(@NotNull Parcel parcel) {
        a.s(parcel, "parcel");
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.params = readBundle == null ? new Bundle() : readBundle;
    }
}
