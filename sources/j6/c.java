package J6;

import F7.l;
import G7.j;
import O7.g;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.bumptech.glide.d;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import java.util.List;
import k.AbstractActivityC2417f;
import u6.Y;
import x6.AbstractDialogC2927c;

/* loaded from: classes3.dex */
public final class c extends AbstractDialogC2927c {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractActivityC2417f f1600c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1601d;

    /* renamed from: f, reason: collision with root package name */
    public final List f1602f;

    /* renamed from: g, reason: collision with root package name */
    public final l f1603g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AbstractActivityC2417f abstractActivityC2417f, String str, ArrayList arrayList, C6.a aVar) {
        super(abstractActivityC2417f, R.style.ThemeDialog);
        j.e(abstractActivityC2417f, "activity");
        this.f1600c = abstractActivityC2417f;
        this.f1601d = str;
        this.f1602f = arrayList;
        this.f1603g = aVar;
    }

    @Override // x6.AbstractDialogC2927c
    public final int b() {
        return R.layout.dialog_rename_file;
    }

    @Override // x6.AbstractDialogC2927c
    public final void c() {
        setCancelable(false);
        ((Y) a()).f23237q.setText(this.f1601d);
    }

    @Override // x6.AbstractDialogC2927c
    public final void d() {
        Y y4 = (Y) a();
        final int i9 = 0;
        y4.f23239s.setOnClickListener(new View.OnClickListener(this) { // from class: J6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f1598c;

            {
                this.f1598c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        c cVar = this.f1598c;
                        j.e(cVar, "this$0");
                        Editable text = ((Y) cVar.a()).f23237q.getText();
                        j.d(text, "getText(...)");
                        int length = text.length();
                        AbstractActivityC2417f abstractActivityC2417f = cVar.f1600c;
                        if (length == 0) {
                            Toast.makeText(abstractActivityC2417f, R.string.enter_a_name, 0).show();
                            return;
                        }
                        Editable text2 = ((Y) cVar.a()).f23237q.getText();
                        j.d(text2, "getText(...)");
                        if (g.L(text2)) {
                            Toast.makeText(abstractActivityC2417f, R.string.empty_or_blank_name, 0).show();
                            return;
                        }
                        if (cVar.f1602f.contains(((Y) cVar.a()).f23237q.getText().toString())) {
                            Toast.makeText(abstractActivityC2417f, R.string.duplicate_name, 0).show();
                            return;
                        }
                        cVar.dismiss();
                        cVar.f1603g.invoke(g.a0(((Y) cVar.a()).f23237q.getText().toString()).toString());
                        return;
                    case 1:
                        c cVar2 = this.f1598c;
                        j.e(cVar2, "this$0");
                        cVar2.dismiss();
                        return;
                    default:
                        c cVar3 = this.f1598c;
                        j.e(cVar3, "this$0");
                        ((Y) cVar3.a()).f23237q.setText("");
                        return;
                }
            }
        });
        Y y6 = (Y) a();
        final int i10 = 1;
        y6.f23240t.setOnClickListener(new View.OnClickListener(this) { // from class: J6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f1598c;

            {
                this.f1598c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        c cVar = this.f1598c;
                        j.e(cVar, "this$0");
                        Editable text = ((Y) cVar.a()).f23237q.getText();
                        j.d(text, "getText(...)");
                        int length = text.length();
                        AbstractActivityC2417f abstractActivityC2417f = cVar.f1600c;
                        if (length == 0) {
                            Toast.makeText(abstractActivityC2417f, R.string.enter_a_name, 0).show();
                            return;
                        }
                        Editable text2 = ((Y) cVar.a()).f23237q.getText();
                        j.d(text2, "getText(...)");
                        if (g.L(text2)) {
                            Toast.makeText(abstractActivityC2417f, R.string.empty_or_blank_name, 0).show();
                            return;
                        }
                        if (cVar.f1602f.contains(((Y) cVar.a()).f23237q.getText().toString())) {
                            Toast.makeText(abstractActivityC2417f, R.string.duplicate_name, 0).show();
                            return;
                        }
                        cVar.dismiss();
                        cVar.f1603g.invoke(g.a0(((Y) cVar.a()).f23237q.getText().toString()).toString());
                        return;
                    case 1:
                        c cVar2 = this.f1598c;
                        j.e(cVar2, "this$0");
                        cVar2.dismiss();
                        return;
                    default:
                        c cVar3 = this.f1598c;
                        j.e(cVar3, "this$0");
                        ((Y) cVar3.a()).f23237q.setText("");
                        return;
                }
            }
        });
        Y y9 = (Y) a();
        final int i11 = 2;
        y9.f23238r.setOnClickListener(new View.OnClickListener(this) { // from class: J6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f1598c;

            {
                this.f1598c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        c cVar = this.f1598c;
                        j.e(cVar, "this$0");
                        Editable text = ((Y) cVar.a()).f23237q.getText();
                        j.d(text, "getText(...)");
                        int length = text.length();
                        AbstractActivityC2417f abstractActivityC2417f = cVar.f1600c;
                        if (length == 0) {
                            Toast.makeText(abstractActivityC2417f, R.string.enter_a_name, 0).show();
                            return;
                        }
                        Editable text2 = ((Y) cVar.a()).f23237q.getText();
                        j.d(text2, "getText(...)");
                        if (g.L(text2)) {
                            Toast.makeText(abstractActivityC2417f, R.string.empty_or_blank_name, 0).show();
                            return;
                        }
                        if (cVar.f1602f.contains(((Y) cVar.a()).f23237q.getText().toString())) {
                            Toast.makeText(abstractActivityC2417f, R.string.duplicate_name, 0).show();
                            return;
                        }
                        cVar.dismiss();
                        cVar.f1603g.invoke(g.a0(((Y) cVar.a()).f23237q.getText().toString()).toString());
                        return;
                    case 1:
                        c cVar2 = this.f1598c;
                        j.e(cVar2, "this$0");
                        cVar2.dismiss();
                        return;
                    default:
                        c cVar3 = this.f1598c;
                        j.e(cVar3, "this$0");
                        ((Y) cVar3.a()).f23237q.setText("");
                        return;
                }
            }
        });
        EditText editText = ((Y) a()).f23237q;
        j.d(editText, "edtSearch");
        d.I(editText, new C6.a(this, 3));
        Y y10 = (Y) a();
        y10.f23237q.setOnEditorActionListener(new b(this, 0));
    }
}
