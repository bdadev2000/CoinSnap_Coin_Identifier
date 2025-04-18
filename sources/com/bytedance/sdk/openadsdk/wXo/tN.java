package com.bytedance.sdk.openadsdk.wXo;

import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN {
    private YFl AlY;
    private Sg Sg;
    private AlY tN;
    private final String YFl = "StrategyCenter";
    private int wN = 0;

    /* renamed from: vc, reason: collision with root package name */
    private Runnable f10843vc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.wXo.tN.2
        @Override // java.lang.Runnable
        public void run() {
            tN.this.Sg();
        }
    };

    public tN(AlY alY) {
        this.Sg = null;
        wN wNVar = new wN(alY);
        this.tN = wNVar;
        String tN = wNVar.tN();
        if (!TextUtils.isEmpty(tN) && !tN.startsWith("pag")) {
            tN = "pag_".concat(tN);
        }
        this.Sg = new Sg(this.tN.Sg(), tN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg() {
        AlY alY = this.tN;
        if (alY == null || alY.wN() == null || this.tN.vc() == null) {
            return;
        }
        this.tN.YFl().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wXo.tN.1
            @Override // java.lang.Runnable
            public void run() {
                String message;
                HttpURLConnection httpURLConnection;
                OutputStream outputStream;
                tN.this.wN++;
                try {
                    if (tN.this.AlY != null) {
                        tN.this.AlY.YFl();
                    }
                    httpURLConnection = (HttpURLConnection) new URL(tN.this.tN.wN()).openConnection();
                    if (tN.this.tN.DSW() != null && tN.this.tN.DSW().size() > 0) {
                        for (Map.Entry<String, String> entry : tN.this.tN.DSW().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                } catch (Throwable th2) {
                    if (th2.getMessage() == null) {
                        message = "error ";
                    } else {
                        message = th2.getMessage();
                    }
                    Log.e("StrategyCenter", message);
                    if (tN.this.AlY != null) {
                        tN.this.AlY.YFl(-1, th2.getMessage());
                    }
                }
                try {
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(tN.this.tN.vc().toString().getBytes());
                        outputStream.close();
                        int responseCode = httpURLConnection.getResponseCode();
                        Log.i("StrategyCenter", "executing strategy fetch");
                        if (responseCode == 200) {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                            StringBuffer stringBuffer = new StringBuffer();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                } else {
                                    stringBuffer.append(readLine);
                                }
                            }
                            bufferedReader.close();
                            JSONObject YFl = tN.this.tN.YFl(new JSONObject(stringBuffer.toString()));
                            tN.this.Sg.YFl();
                            tN.this.Sg.YFl(YFl);
                            if (tN.this.AlY != null) {
                                tN.this.AlY.Sg();
                            }
                        } else if (tN.this.AlY != null) {
                            tN.this.AlY.YFl(responseCode, httpURLConnection.getResponseMessage());
                        }
                        tN.this.Sg.YFl("local_last_update_time", System.currentTimeMillis());
                        tN.this.YFl();
                    } catch (Throwable th3) {
                        th = th3;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    outputStream = null;
                }
            }
        });
    }

    public void YFl(YFl yFl) {
        this.AlY = yFl;
    }

    public void YFl() {
        if (this.tN != null) {
            Sg sg2 = this.Sg;
            int i10 = Constants.ONE_HOUR;
            int YFl = sg2.YFl("req_interval", Constants.ONE_HOUR);
            long j3 = 0;
            long Sg = this.Sg.Sg("local_last_update_time", 0L);
            if (YFl >= 600000 && YFl <= 86400000) {
                i10 = YFl;
            }
            long currentTimeMillis = System.currentTimeMillis() - Sg;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(currentTimeMillis)));
            if (currentTimeMillis >= 0) {
                long j10 = i10;
                if (currentTimeMillis <= j10) {
                    j3 = j10 - currentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j3)));
            this.tN.AlY().removeCallbacks(this.f10843vc);
            if (this.wN > 24) {
                return;
            }
            this.tN.AlY().postDelayed(this.f10843vc, j3);
        }
    }

    public int YFl(String str, int i10) {
        Sg sg2 = this.Sg;
        return sg2 == null ? i10 : sg2.YFl(str, i10);
    }

    public String YFl(String str, String str2) {
        Sg sg2 = this.Sg;
        return sg2 == null ? str2 : sg2.YFl(str, str2);
    }

    public boolean YFl(String str, boolean z10) {
        Sg sg2 = this.Sg;
        return sg2 == null ? z10 : sg2.YFl(str, z10);
    }
}
