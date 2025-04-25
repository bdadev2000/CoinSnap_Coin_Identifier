package com.glority.android.ui.base;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import com.glority.android.ui.base.FragmentHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExcludeNPSContainerActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/glority/android/ui/base/ExcludeNPSContainerActivity;", "Lcom/glority/android/ui/base/ContainerActivity;", "()V", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class ExcludeNPSContainerActivity extends ContainerActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // com.glority.android.ui.base.ContainerActivity, com.glority.android.ui.base.BaseActivity, com.glority.android.ui.base.ThemedActivity, com.glority.android.ui.base.RuntimePermissionActivity
    public void _$_clearFindViewByIdCache() {
    }

    /* compiled from: ExcludeNPSContainerActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\b¨\u0006\t"}, d2 = {"Lcom/glority/android/ui/base/ExcludeNPSContainerActivity$Companion;", "", "()V", "open", "Lcom/glority/android/ui/base/FragmentHelper$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "withClz", "Ljava/lang/Class;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T extends Fragment> FragmentHelper.Builder<T> open(Class<T> withClz) {
            Intrinsics.checkNotNullParameter(withClz, "withClz");
            return new FragmentHelper.Builder<>(withClz);
        }
    }
}
