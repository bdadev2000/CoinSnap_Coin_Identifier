package b0;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import com.cooldev.gba.emulator.gameboy.R;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Typeface f22277a = Typeface.create("sans-serif-condensed", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f22278b = 16;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f22279c = true;
    public static final boolean d = true;
    public static final int e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f22280f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f22281g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static Toast f22282h = null;

    public static Toast a(Context context, String str, Drawable drawable, int i2, int i3) {
        Toast makeText = Toast.makeText(context, "", 0);
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.toast_layout, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.toast_icon);
        TextView textView = (TextView) inflate.findViewById(R.id.toast_text);
        NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) AppCompatResources.a(context, 2131231301);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ninePatchDrawable.setColorFilter(i2, mode);
        inflate.setBackground(ninePatchDrawable);
        if (drawable == null) {
            throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
        }
        if (f22279c) {
            drawable.setColorFilter(i3, mode);
        }
        imageView.setBackground(drawable);
        textView.setText(str);
        textView.setTextColor(i3);
        textView.setTypeface(f22277a);
        textView.setTextSize(2, f22278b);
        makeText.setView(inflate);
        if (!d) {
            Toast toast = f22282h;
            if (toast != null) {
                toast.cancel();
            }
            f22282h = makeText;
        }
        int i4 = e;
        if (i4 == -1) {
            i4 = makeText.getGravity();
        }
        int i5 = f22280f;
        if (i5 == -1) {
            i5 = makeText.getXOffset();
        }
        int i6 = f22281g;
        if (i6 == -1) {
            i6 = makeText.getYOffset();
        }
        makeText.setGravity(i4, i5, i6);
        return makeText;
    }

    public static Toast b(Context context, String str) {
        return a(context, str, AppCompatResources.a(context, 2131231099), ContextCompat.getColor(context, R.color.errorColor), ContextCompat.getColor(context, R.color.defaultTextColor));
    }

    public static Toast c(Context context, String str) {
        return a(context, str, AppCompatResources.a(context, 2131231097), ContextCompat.getColor(context, R.color.successColor), ContextCompat.getColor(context, R.color.defaultTextColor));
    }
}
