package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import h.w;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class ContentInfoCompat {

    /* renamed from: a, reason: collision with root package name */
    public final Compat f18691a;

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class Api31Impl {
        @NonNull
        @DoNotInline
        public static Pair<ContentInfo, ContentInfo> a(@NonNull ContentInfo contentInfo, @NonNull Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean test = predicate.test(clip.getItemAt(0));
                ContentInfo contentInfo2 = test ? contentInfo : null;
                if (test) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (int i2 = 0; i2 < clip.getItemCount(); i2++) {
                ClipData.Item itemAt = clip.getItemAt(i2);
                if (predicate.test(itemAt)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(itemAt);
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(itemAt);
                }
            }
            Pair create = arrayList == null ? Pair.create(null, clip) : arrayList2 == null ? Pair.create(clip, null) : Pair.create(ContentInfoCompat.a(clip.getDescription(), arrayList), ContentInfoCompat.a(clip.getDescription(), arrayList2));
            return create.first == null ? Pair.create(null, contentInfo) : create.second == null ? Pair.create(contentInfo, null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) create.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) create.second).build());
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final BuilderCompat f18692a;

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.core.view.ContentInfoCompat$BuilderCompatImpl, java.lang.Object, androidx.core.view.ContentInfoCompat$BuilderCompat] */
        public Builder(ClipData clipData, int i2) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f18692a = new BuilderCompat31Impl(clipData, i2);
                return;
            }
            ?? obj = new Object();
            obj.f18694a = clipData;
            obj.f18695b = i2;
            this.f18692a = obj;
        }

        public final ContentInfoCompat a() {
            return this.f18692a.build();
        }

        public final void b(Bundle bundle) {
            this.f18692a.setExtras(bundle);
        }

        public final void c(int i2) {
            this.f18692a.b(i2);
        }

        public final void d(Uri uri) {
            this.f18692a.a(uri);
        }
    }

    /* loaded from: classes.dex */
    public interface BuilderCompat {
        void a(Uri uri);

        void b(int i2);

        ContentInfoCompat build();

        void setExtras(Bundle bundle);
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class BuilderCompat31Impl implements BuilderCompat {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f18693a;

        public BuilderCompat31Impl(ClipData clipData, int i2) {
            this.f18693a = w.b(clipData, i2);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void a(Uri uri) {
            this.f18693a.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void b(int i2) {
            this.f18693a.setFlags(i2);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final ContentInfoCompat build() {
            ContentInfo build;
            build = this.f18693a.build();
            return new ContentInfoCompat(new Compat31Impl(build));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void setExtras(Bundle bundle) {
            this.f18693a.setExtras(bundle);
        }
    }

    /* loaded from: classes.dex */
    public static final class BuilderCompatImpl implements BuilderCompat {

        /* renamed from: a, reason: collision with root package name */
        public ClipData f18694a;

        /* renamed from: b, reason: collision with root package name */
        public int f18695b;

        /* renamed from: c, reason: collision with root package name */
        public int f18696c;
        public Uri d;
        public Bundle e;

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void a(Uri uri) {
            this.d = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void b(int i2) {
            this.f18696c = i2;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final ContentInfoCompat build() {
            return new ContentInfoCompat(new CompatImpl(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void setExtras(Bundle bundle) {
            this.e = bundle;
        }
    }

    /* loaded from: classes.dex */
    public interface Compat {
        ContentInfo a();

        ClipData b();

        int c();

        int getSource();
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class Compat31Impl implements Compat {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo f18697a;

        public Compat31Impl(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f18697a = androidx.compose.ui.contentcapture.a.i(contentInfo);
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final ContentInfo a() {
            return this.f18697a;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final ClipData b() {
            ClipData clip;
            clip = this.f18697a.getClip();
            return clip;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int c() {
            int flags;
            flags = this.f18697a.getFlags();
            return flags;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int getSource() {
            int source;
            source = this.f18697a.getSource();
            return source;
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f18697a + "}";
        }
    }

    /* loaded from: classes.dex */
    public static final class CompatImpl implements Compat {

        /* renamed from: a, reason: collision with root package name */
        public final ClipData f18698a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18699b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18700c;
        public final Uri d;
        public final Bundle e;

        public CompatImpl(BuilderCompatImpl builderCompatImpl) {
            ClipData clipData = builderCompatImpl.f18694a;
            clipData.getClass();
            this.f18698a = clipData;
            int i2 = builderCompatImpl.f18695b;
            if (i2 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
            }
            if (i2 > 5) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
            }
            this.f18699b = i2;
            int i3 = builderCompatImpl.f18696c;
            if ((i3 & 1) == i3) {
                this.f18700c = i3;
                this.d = builderCompatImpl.d;
                this.e = builderCompatImpl.e;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i3) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final ContentInfo a() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final ClipData b() {
            return this.f18698a;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int c() {
            return this.f18700c;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int getSource() {
            return this.f18699b;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f18698a.getDescription());
            sb.append(", source=");
            int i2 = this.f18699b;
            sb.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            sb.append(", flags=");
            int i3 = this.f18700c;
            sb.append((i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3));
            Uri uri = this.d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            return android.support.v4.media.d.r(sb, this.e != null ? ", hasExtras" : "", "}");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface Flags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface Source {
    }

    public ContentInfoCompat(Compat compat) {
        this.f18691a = compat;
    }

    public static ClipData a(ClipDescription clipDescription, ArrayList arrayList) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) arrayList.get(0));
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            clipData.addItem((ClipData.Item) arrayList.get(i2));
        }
        return clipData;
    }

    public final ClipData b() {
        return this.f18691a.b();
    }

    public final int c() {
        return this.f18691a.c();
    }

    public final int d() {
        return this.f18691a.getSource();
    }

    public final String toString() {
        return this.f18691a.toString();
    }
}
