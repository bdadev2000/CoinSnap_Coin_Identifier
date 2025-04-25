package com.glority.android.picturexx.view.dialog;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.business.R;
import com.glority.android.ui.base.BaseDialog;
import com.glority.android.xx.constants.LogEvents;
import com.glority.utils.ui.ViewUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsViewTipsDialog.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u0003H\u0014J\b\u0010\u000e\u001a\u00020\bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/CmsViewTipsDialog;", "Lcom/glority/android/ui/base/BaseDialog;", NotificationCompat.CATEGORY_MESSAGE, "", "activity", "Landroid/app/Activity;", "gotItClickListener", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V", "getLayoutId", "", "getLogPageName", "initView", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CmsViewTipsDialog extends BaseDialog {
    public static final int $stable = 0;
    public static final int TYPE_OPEN_ADVISED = 0;
    public static final int TYPE_OPEN_IMAGE_ADVISED = 1;
    private final Function0<Unit> gotItClickListener;
    private final String msg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmsViewTipsDialog(String msg, Activity activity, Function0<Unit> gotItClickListener) {
        super(activity);
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(gotItClickListener, "gotItClickListener");
        this.msg = msg;
        this.gotItClickListener = gotItClickListener;
    }

    public /* synthetic */ CmsViewTipsDialog(String str, Activity activity, AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, activity, (i & 4) != 0 ? new Function0<Unit>() { // from class: com.glority.android.picturexx.view.dialog.CmsViewTipsDialog.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : anonymousClass1);
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected int getLayoutId() {
        return R.layout.dialog_cms_view_tips;
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected String getLogPageName() {
        return LogEvents.cmsviewtips;
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected void initView() {
        ((TextView) findViewById(R.id.tv_content)).setText(this.msg);
        View findViewById = findViewById(R.id.tv_got_it);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ViewExtensionsKt.setSingleClickListener$default(findViewById, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CmsViewTipsDialog$initView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Function0 function0;
                Intrinsics.checkNotNullParameter(it, "it");
                function0 = CmsViewTipsDialog.this.gotItClickListener;
                function0.invoke();
                CmsViewTipsDialog.this.dismiss();
            }
        }, 1, (Object) null);
        setDialogWidth((int) (ViewUtils.getScreenWidth() * 0.9f));
    }
}
