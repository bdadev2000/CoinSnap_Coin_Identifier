package com.glority.base.dialog;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.widget.DatePicker;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.compose.DialogNavigator;
import com.glority.android.core.app.AppContext;
import com.glority.android.xx.constants.Args;
import com.glority.base.R;
import com.glority.utils.stability.LogUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomDatePickerDialog.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/glority/base/dialog/CustomDatePickerDialog;", "Landroid/app/Dialog;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "datePicker", "Landroid/widget/DatePicker;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/glority/base/dialog/CustomDatePickerDialog$Listener;", "show", "", Args.year, "", "monthOfYear", "dayOfMonth", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "Listener", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class CustomDatePickerDialog extends Dialog implements DefaultLifecycleObserver {
    public static final int $stable = 8;
    private DatePicker datePicker;
    private Listener listener;

    /* compiled from: CustomDatePickerDialog.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/glority/base/dialog/CustomDatePickerDialog$Listener;", "", "onDateChanged", "", DialogNavigator.NAME, "Lcom/glority/base/dialog/CustomDatePickerDialog;", Args.year, "", "monthOfYear", "dayOfMonth", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public interface Listener {
        void onDateChanged(CustomDatePickerDialog dialog, int year, int monthOfYear, int dayOfMonth);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CustomDatePickerDialog(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setContentView(R.layout.dialog_date_picker);
        this.datePicker = (DatePicker) findViewById(R.id.date_picker);
        setCanceledOnTouchOutside(true);
        if (context instanceof LifecycleOwner) {
            ((LifecycleOwner) context).getLifecycle().addObserver(this);
        }
    }

    public final void show(int year, int monthOfYear, int dayOfMonth, Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.datePicker.init(year, monthOfYear, dayOfMonth, new DatePicker.OnDateChangedListener() { // from class: com.glority.base.dialog.CustomDatePickerDialog$$ExternalSyntheticLambda0
            @Override // android.widget.DatePicker.OnDateChangedListener
            public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
                CustomDatePickerDialog.show$lambda$1(CustomDatePickerDialog.this, datePicker, i, i2, i3);
            }
        });
        show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$1(CustomDatePickerDialog this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Listener listener = this$0.listener;
            if (listener != null) {
                listener.onDateChanged(this$0, i, i2, i3);
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    public final void show(Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Calendar calendar = Calendar.getInstance();
        show(calendar.get(1), calendar.get(2), calendar.get(5), listener);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        dismiss();
    }
}
