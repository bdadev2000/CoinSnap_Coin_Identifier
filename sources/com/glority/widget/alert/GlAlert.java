package com.glority.widget.alert;

import android.content.Context;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.xx.constants.Args;
import com.glority.widget.R;
import com.glority.widget.alert.GlAlert;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlAlert.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/glority/widget/alert/GlAlert;", "", "()V", "Builder", "ButtonStyle", "DialogStyle", ExifInterface.TAG_ORIENTATION, "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlAlert {

    /* compiled from: GlAlert.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/glority/widget/alert/GlAlert$ButtonStyle;", "", "(Ljava/lang/String;I)V", "GRADIENT", "TEXT", "OUTLINE", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public enum ButtonStyle {
        GRADIENT,
        TEXT,
        OUTLINE
    }

    /* compiled from: GlAlert.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/glority/widget/alert/GlAlert$DialogStyle;", "", "(Ljava/lang/String;I)V", "SYSTEM", "CUSTOM", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public enum DialogStyle {
        SYSTEM,
        CUSTOM
    }

    /* compiled from: GlAlert.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/glority/widget/alert/GlAlert$Orientation;", "", "(Ljava/lang/String;I)V", "VERTICAL", "HORIZONTAL", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public enum Orientation {
        VERTICAL,
        HORIZONTAL
    }

    private GlAlert() {
    }

    /* compiled from: GlAlert.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020&H\u0002J\u001a\u0010*\u001a\u00020&2\u0006\u0010'\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u001eH\u0002J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010.\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\u0018\u0010/\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014J\u001c\u00101\u001a\u00020\u00002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u00103\u001a\u00020\u0016J\u0010\u00104\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012J\u000e\u00104\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0007J\"\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u001c2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001eJ\"\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u001c2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001eJ\"\u00108\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u001c2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001eJ\"\u00108\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u001c2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001eJ\u001a\u00109\u001a\u00020&2\b\u00106\u001a\u0004\u0018\u00010\u00122\u0006\u0010'\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0012J\u000e\u0010;\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0007J\u0006\u0010<\u001a\u00020\nJ\u0006\u0010#\u001a\u00020\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/glority/widget/alert/GlAlert$Builder;", "", "context", "Landroid/content/Context;", "dialogStyle", "Lcom/glority/widget/alert/GlAlert$DialogStyle;", "theme", "", "(Landroid/content/Context;Lcom/glority/widget/alert/GlAlert$DialogStyle;I)V", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "getAlertDialog$mod_release", "()Landroidx/appcompat/app/AlertDialog;", "setAlertDialog$mod_release", "(Landroidx/appcompat/app/AlertDialog;)V", "cancelable", "", "etHint", "", "glAlertEditListener", "Lcom/glority/widget/alert/GlAlertEditListener;", "itemOrientation", "Lcom/glority/widget/alert/GlAlert$Orientation;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/glority/widget/alert/GlAlertItem;", LogEventArguments.ARG_MESSAGE, "negativeOnClickListener", "Lcom/glority/widget/alert/GlAlertOnClickListener;", "negativeStyle", "Lcom/glority/widget/alert/GlAlert$ButtonStyle;", "negativeText", "positiveOnClickListener", "positiveStyle", "positiveText", "showCloseIcon", Args.title, "adjustCustomDialog", "", "view", "Landroid/view/View;", "assertDialogStyle", "setButtonStyle", "Landroid/widget/Button;", "buttonStyle", "setCancelable", "setCommonData", "setEditText", "hint", "setItems", "list", "orientation", "setMessage", "setNegativeButton", "text", "onClickListener", "setPositiveButton", "setTextOrGone", "Landroid/widget/TextView;", "setTitle", "show", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class Builder {
        private AlertDialog alertDialog;
        private boolean cancelable;
        private final Context context;
        private final DialogStyle dialogStyle;
        private CharSequence etHint;
        private GlAlertEditListener glAlertEditListener;
        private Orientation itemOrientation;
        private List<GlAlertItem> items;
        private CharSequence message;
        private GlAlertOnClickListener negativeOnClickListener;
        private ButtonStyle negativeStyle;
        private CharSequence negativeText;
        private GlAlertOnClickListener positiveOnClickListener;
        private ButtonStyle positiveStyle;
        private CharSequence positiveText;
        private boolean showCloseIcon;
        private final int theme;
        private CharSequence title;

        public Builder(Context context, DialogStyle dialogStyle, int i) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dialogStyle, "dialogStyle");
            this.context = context;
            this.dialogStyle = dialogStyle;
            this.theme = i;
            this.itemOrientation = Orientation.HORIZONTAL;
        }

        public /* synthetic */ Builder(Context context, DialogStyle dialogStyle, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, dialogStyle, (i2 & 4) != 0 ? 0 : i);
        }

        /* renamed from: getAlertDialog$mod_release, reason: from getter */
        public final AlertDialog getAlertDialog() {
            return this.alertDialog;
        }

        public final void setAlertDialog$mod_release(AlertDialog alertDialog) {
            this.alertDialog = alertDialog;
        }

        public final Builder setCancelable(boolean cancelable) {
            this.cancelable = cancelable;
            return this;
        }

        public final Builder setTitle(CharSequence title) {
            this.title = title;
            return this;
        }

        public final Builder setTitle(int title) {
            this.title = this.context.getString(title);
            return this;
        }

        public final Builder setMessage(CharSequence message) {
            this.message = message;
            return this;
        }

        public final Builder setMessage(int message) {
            this.message = this.context.getString(message);
            return this;
        }

        public final Builder setEditText(int hint, GlAlertEditListener glAlertEditListener) {
            Intrinsics.checkNotNullParameter(glAlertEditListener, "glAlertEditListener");
            return setEditText(this.context.getString(hint), glAlertEditListener);
        }

        public final Builder setEditText(CharSequence hint, GlAlertEditListener glAlertEditListener) {
            Intrinsics.checkNotNullParameter(glAlertEditListener, "glAlertEditListener");
            this.etHint = hint;
            this.glAlertEditListener = glAlertEditListener;
            return this;
        }

        public final Builder showCloseIcon() {
            this.showCloseIcon = true;
            return this;
        }

        public static /* synthetic */ Builder setPositiveButton$default(Builder builder, CharSequence charSequence, GlAlertOnClickListener glAlertOnClickListener, ButtonStyle buttonStyle, int i, Object obj) {
            if ((i & 4) != 0) {
                buttonStyle = null;
            }
            return builder.setPositiveButton(charSequence, glAlertOnClickListener, buttonStyle);
        }

        public final Builder setPositiveButton(CharSequence text, GlAlertOnClickListener onClickListener, ButtonStyle buttonStyle) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            this.positiveText = text;
            this.positiveStyle = buttonStyle;
            this.positiveOnClickListener = onClickListener;
            return this;
        }

        public static /* synthetic */ Builder setPositiveButton$default(Builder builder, int i, GlAlertOnClickListener glAlertOnClickListener, ButtonStyle buttonStyle, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                buttonStyle = null;
            }
            return builder.setPositiveButton(i, glAlertOnClickListener, buttonStyle);
        }

        public final Builder setPositiveButton(int text, GlAlertOnClickListener onClickListener, ButtonStyle buttonStyle) {
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            String string = this.context.getString(text);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(text)");
            return setPositiveButton(string, onClickListener, buttonStyle);
        }

        public static /* synthetic */ Builder setNegativeButton$default(Builder builder, CharSequence charSequence, GlAlertOnClickListener glAlertOnClickListener, ButtonStyle buttonStyle, int i, Object obj) {
            if ((i & 4) != 0) {
                buttonStyle = null;
            }
            return builder.setNegativeButton(charSequence, glAlertOnClickListener, buttonStyle);
        }

        public final Builder setNegativeButton(CharSequence text, GlAlertOnClickListener onClickListener, ButtonStyle buttonStyle) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            this.negativeText = text;
            this.negativeStyle = buttonStyle;
            this.negativeOnClickListener = onClickListener;
            return this;
        }

        public static /* synthetic */ Builder setNegativeButton$default(Builder builder, int i, GlAlertOnClickListener glAlertOnClickListener, ButtonStyle buttonStyle, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                buttonStyle = null;
            }
            return builder.setNegativeButton(i, glAlertOnClickListener, buttonStyle);
        }

        public final Builder setNegativeButton(int text, GlAlertOnClickListener onClickListener, ButtonStyle buttonStyle) {
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            String string = this.context.getString(text);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(text)");
            return setNegativeButton(string, onClickListener, buttonStyle);
        }

        public final Builder setItems(List<GlAlertItem> list, Orientation orientation) {
            Intrinsics.checkNotNullParameter(list, "list");
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            this.items = list;
            this.itemOrientation = orientation;
            return this;
        }

        public final AlertDialog show() {
            View inflate;
            ContextThemeWrapper contextThemeWrapper = this.context;
            if (this.theme != 0) {
                contextThemeWrapper = new ContextThemeWrapper(this.context, this.theme);
            }
            assertDialogStyle();
            if (this.dialogStyle == DialogStyle.SYSTEM) {
                inflate = LayoutInflater.from(contextThemeWrapper).inflate(R.layout.gl_alert_system, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…ut.gl_alert_system, null)");
            } else {
                inflate = LayoutInflater.from(contextThemeWrapper).inflate(R.layout.gl_alert_custom, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…ut.gl_alert_custom, null)");
                adjustCustomDialog(inflate);
            }
            setCommonData(inflate);
            AlertDialog show = new MaterialAlertDialogBuilder(contextThemeWrapper).setBackground(AppCompatResources.getDrawable(contextThemeWrapper, R.drawable.gl_alert_bg)).setCancelable(this.cancelable).setView(inflate).show();
            this.alertDialog = show;
            Intrinsics.checkNotNull(show);
            return show;
        }

        private final void adjustCustomDialog(View view) {
            ImageView closeIv = (ImageView) view.findViewById(R.id.iv_close);
            Button negativeBt = (Button) view.findViewById(R.id.negative);
            Button positiveBt = (Button) view.findViewById(R.id.positive);
            RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv);
            closeIv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.alert.GlAlert$Builder$adjustCustomDialog$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AlertDialog alertDialog = GlAlert.Builder.this.getAlertDialog();
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                }
            });
            Intrinsics.checkNotNullExpressionValue(closeIv, "closeIv");
            closeIv.setVisibility(this.showCloseIcon ? 0 : 4);
            Intrinsics.checkNotNullExpressionValue(negativeBt, "negativeBt");
            setButtonStyle(negativeBt, this.negativeStyle);
            Intrinsics.checkNotNullExpressionValue(positiveBt, "positiveBt");
            setButtonStyle(positiveBt, this.positiveStyle);
            List<GlAlertItem> list = this.items;
            if (list == null || list.isEmpty()) {
                return;
            }
            if (this.itemOrientation == Orientation.HORIZONTAL) {
                List<GlAlertItem> list2 = this.items;
                Intrinsics.checkNotNull(list2);
                if (list2.size() > 3) {
                    throw new IllegalArgumentException("horizontal item must less then 4");
                }
                Intrinsics.checkNotNullExpressionValue(rv, "rv");
                Context context = this.context;
                List<GlAlertItem> list3 = this.items;
                Intrinsics.checkNotNull(list3);
                rv.setLayoutManager(new GridLayoutManager(context, list3.size(), 1, false));
            } else {
                Intrinsics.checkNotNullExpressionValue(rv, "rv");
                rv.setLayoutManager(new LinearLayoutManager(this.context, 1, false));
            }
            List<GlAlertItem> list4 = this.items;
            Intrinsics.checkNotNull(list4);
            rv.setAdapter(new GlAlertItemAdapter(list4, this.itemOrientation, this));
        }

        private final void setButtonStyle(Button view, ButtonStyle buttonStyle) {
            if (buttonStyle == ButtonStyle.TEXT) {
                view.setBackground(null);
                TypedValue typedValue = new TypedValue();
                this.context.getTheme().resolveAttribute(android.R.attr.colorPrimary, typedValue, true);
                view.setTextColor(typedValue.data);
                return;
            }
            if (buttonStyle == ButtonStyle.OUTLINE) {
                view.setBackground(this.context.getDrawable(R.drawable.gl_bt_outline_bg));
                TypedValue typedValue2 = new TypedValue();
                this.context.getTheme().resolveAttribute(android.R.attr.colorPrimary, typedValue2, true);
                view.setTextColor(typedValue2.data);
                return;
            }
            view.setBackground(this.context.getDrawable(R.drawable.gl_bt_gradient_bg_big));
            view.setTextColor(-1);
        }

        private final void setCommonData(View view) {
            TextView titleTv = (TextView) view.findViewById(R.id.title);
            TextView msgTv = (TextView) view.findViewById(R.id.msg);
            final TextInputEditText et = (TextInputEditText) view.findViewById(R.id.et);
            Button negativeBt = (Button) view.findViewById(R.id.negative);
            Button positiveBt = (Button) view.findViewById(R.id.positive);
            CharSequence charSequence = this.title;
            Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
            setTextOrGone(charSequence, titleTv);
            CharSequence charSequence2 = this.message;
            Intrinsics.checkNotNullExpressionValue(msgTv, "msgTv");
            setTextOrGone(charSequence2, msgTv);
            CharSequence charSequence3 = this.negativeText;
            Intrinsics.checkNotNullExpressionValue(negativeBt, "negativeBt");
            setTextOrGone(charSequence3, negativeBt);
            CharSequence charSequence4 = this.positiveText;
            Intrinsics.checkNotNullExpressionValue(positiveBt, "positiveBt");
            setTextOrGone(charSequence4, positiveBt);
            CharSequence charSequence5 = this.etHint;
            if (charSequence5 == null || charSequence5.length() == 0) {
                Intrinsics.checkNotNullExpressionValue(et, "et");
                et.setVisibility(8);
            } else {
                Intrinsics.checkNotNullExpressionValue(et, "et");
                et.setVisibility(0);
                et.setHint(this.etHint);
            }
            negativeBt.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.alert.GlAlert$Builder$setCommonData$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GlAlertOnClickListener glAlertOnClickListener;
                    glAlertOnClickListener = GlAlert.Builder.this.negativeOnClickListener;
                    if (glAlertOnClickListener != null) {
                        AlertDialog alertDialog = GlAlert.Builder.this.getAlertDialog();
                        Intrinsics.checkNotNull(alertDialog);
                        glAlertOnClickListener.onClick(alertDialog);
                    }
                }
            });
            positiveBt.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.alert.GlAlert$Builder$setCommonData$2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GlAlertEditListener glAlertEditListener;
                    GlAlertOnClickListener glAlertOnClickListener;
                    glAlertEditListener = GlAlert.Builder.this.glAlertEditListener;
                    if (glAlertEditListener != null) {
                        TextInputEditText et2 = et;
                        Intrinsics.checkNotNullExpressionValue(et2, "et");
                        glAlertEditListener.afterEdit(String.valueOf(et2.getText()));
                    }
                    glAlertOnClickListener = GlAlert.Builder.this.positiveOnClickListener;
                    if (glAlertOnClickListener != null) {
                        AlertDialog alertDialog = GlAlert.Builder.this.getAlertDialog();
                        Intrinsics.checkNotNull(alertDialog);
                        glAlertOnClickListener.onClick(alertDialog);
                    }
                }
            });
        }

        private final void setTextOrGone(CharSequence text, TextView view) {
            if (text == null || text.length() == 0) {
                view.setVisibility(8);
            } else {
                view.setText(text);
                view.setVisibility(0);
            }
        }

        private final void assertDialogStyle() {
            if (this.dialogStyle == DialogStyle.SYSTEM) {
                if (this.showCloseIcon) {
                    throw new IllegalArgumentException("system style dialog cant showCloseIcon");
                }
                if (this.positiveStyle != null) {
                    throw new IllegalArgumentException("system style dialog cant have positiveStyle");
                }
                if (this.negativeStyle != null) {
                    throw new IllegalArgumentException("system style dialog cant have negativeStyle");
                }
                if (this.items != null) {
                    throw new IllegalArgumentException("system style dialog unsupported items");
                }
            }
        }
    }
}
