package com.mbridge.msdk.foundation.same.report.d;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.tracker.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e {
    private Map<String, String> c(String str, b bVar) {
        d dVar = new d();
        try {
            if (str.equals("2000125")) {
                dVar.a("duration", Long.valueOf(bVar.l("2000123")));
            } else if (str.equals("2000126")) {
                dVar.a("duration", Long.valueOf(bVar.l("2000125")));
            } else if (str.equals("2000127")) {
                dVar.a("duration", Long.valueOf(bVar.l("2000123")));
            } else if (str.equals("2000154")) {
                dVar.a("duration", Long.valueOf(bVar.l("2000126")));
            } else if (str.equals("2000047")) {
                dVar.a("duration", Long.valueOf(bVar.l("2000123")));
            } else if (str.equals("2000048")) {
                dVar.a("duration", Long.valueOf(bVar.l("2000123")));
            } else if (str.equals("2000155")) {
                dVar.a("duration", Long.valueOf(bVar.l("2000154")));
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return dVar.a();
    }

    private Map<String, String> d(String str, b bVar) {
        HashMap hashMap = new HashMap();
        try {
            if (Arrays.asList(a.f13453e).contains(str)) {
                String str2 = "";
                if (bVar != null) {
                    str2 = bVar.d();
                }
                hashMap.put("auto_load", str2);
            }
            if (bVar != null) {
                Map<String, Map<String, String>> p10 = bVar.p();
                String str3 = bVar.f() + str;
                if (p10.containsKey(str3) && p10.get(str3) != null) {
                    hashMap.putAll(p10.get(str3));
                }
                try {
                    Map<String, Map<String, String>> q10 = bVar.q();
                    String str4 = bVar.f() + "_" + bVar.b() + "_" + str;
                    if (q10.containsKey(str4) && q10.get(str4) != null) {
                        hashMap.putAll(q10.get(str4));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return hashMap;
    }

    public final void a(String str, m mVar, b bVar, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        Map<String, String> c10;
        HashMap hashMap = new HashMap();
        if (bVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            bVar.a(str);
            if (str.equals("2000146")) {
                bVar.j();
            }
            Map<String, String> b3 = b(str, bVar);
            if (b3 != null) {
                hashMap.putAll(b3);
            }
            Map<String, String> a = a(str, bVar.i(), mVar);
            if (a != null) {
                hashMap.putAll(a);
            }
            if (Arrays.asList(a.f13452d).contains(str) && (c10 = c(str, bVar)) != null) {
                hashMap.putAll(c10);
            }
            Map<String, String> d10 = d(str, bVar);
            if (d10 != null) {
                hashMap.putAll(d10);
            }
            if (!hashMap.containsKey("lrid") || TextUtils.isEmpty((CharSequence) hashMap.get("lrid"))) {
                hashMap.put("lrid", bVar.f());
            }
            Map<String, String> a10 = a(str, bVar);
            if (a10 != null) {
                hashMap.putAll(a10);
            }
            if (bVar.d() != null && bVar.d().equals("1") && Arrays.asList(a.f13450b).contains(str)) {
                return;
            }
            com.mbridge.msdk.tracker.e a11 = a(str, hashMap);
            if (mVar != null && a11 != null) {
                mVar.a(a11);
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public final void b(String str, m mVar, b bVar, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        if (bVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            bVar.a(str);
            Map<String, String> a = a(str, bVar.i(), mVar);
            if (a != null) {
                hashMap.putAll(a);
            }
            Map<String, String> d10 = d(str, bVar);
            if (d10 != null) {
                hashMap.putAll(d10);
            }
            Map<String, String> a10 = a(str, bVar);
            if (a10 != null) {
                hashMap.putAll(a10);
            }
            com.mbridge.msdk.tracker.e a11 = a(str, hashMap);
            if (mVar != null && a11 != null) {
                mVar.a(a11);
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad A[Catch: Exception -> 0x0669, TryCatch #2 {Exception -> 0x0669, blocks: (B:3:0x0019, B:5:0x0025, B:9:0x002c, B:11:0x0038, B:251:0x0073, B:254:0x007c, B:256:0x0082, B:258:0x008d, B:260:0x0093, B:29:0x00e3, B:32:0x00eb, B:33:0x00ef, B:35:0x00f5, B:38:0x00fe, B:40:0x0108, B:42:0x011b, B:43:0x0124, B:44:0x0137, B:46:0x0146, B:47:0x0153, B:50:0x015b, B:52:0x0161, B:54:0x0167, B:55:0x0197, B:57:0x01a1, B:59:0x01a7, B:60:0x01c5, B:61:0x01d0, B:63:0x01d8, B:65:0x01de, B:66:0x01fc, B:67:0x0207, B:69:0x020f, B:71:0x0215, B:72:0x0233, B:73:0x023e, B:75:0x0246, B:77:0x024c, B:78:0x026a, B:79:0x0275, B:82:0x0296, B:84:0x02a0, B:85:0x02a5, B:87:0x02ab, B:88:0x02c9, B:91:0x02d9, B:92:0x0363, B:94:0x036d, B:96:0x037c, B:97:0x039c, B:98:0x03a5, B:101:0x03ae, B:103:0x03b4, B:104:0x03ef, B:107:0x03fa, B:109:0x0410, B:110:0x0435, B:112:0x043b, B:113:0x0460, B:115:0x0464, B:117:0x0474, B:118:0x0479, B:120:0x0483, B:121:0x048c, B:123:0x0492, B:124:0x049f, B:127:0x04aa, B:129:0x04c2, B:131:0x04c9, B:132:0x04d6, B:134:0x04e0, B:135:0x04e9, B:137:0x04f1, B:139:0x04f8, B:140:0x0505, B:142:0x050f, B:143:0x0518, B:144:0x0525, B:146:0x052d, B:153:0x0539, B:156:0x0547, B:158:0x056d, B:161:0x0576, B:163:0x057d, B:165:0x0585, B:168:0x058e, B:170:0x0595, B:172:0x05a1, B:177:0x062e, B:178:0x05af, B:180:0x05bb, B:182:0x05c5, B:184:0x05e0, B:185:0x05f0, B:188:0x05f7, B:189:0x05e9, B:190:0x05d0, B:192:0x05d6, B:194:0x05ff, B:196:0x060f, B:197:0x0620, B:200:0x0627, B:201:0x0618, B:203:0x0459, B:204:0x042e, B:206:0x03cb, B:207:0x03cf, B:209:0x03d5, B:210:0x03ec, B:211:0x02f1, B:213:0x030a, B:214:0x030e, B:215:0x02c4, B:216:0x0312, B:218:0x031e, B:219:0x0323, B:221:0x0329, B:222:0x0343, B:224:0x0349, B:225:0x0360, B:226:0x0340, B:227:0x0187, B:229:0x012e, B:236:0x0664, B:262:0x0087, B:263:0x0099, B:21:0x00a5, B:23:0x00ad, B:25:0x00b8, B:27:0x00be, B:238:0x00c2, B:240:0x00c8, B:241:0x00d0, B:242:0x00d4, B:244:0x00da, B:245:0x00b2, B:273:0x0053, B:14:0x003e, B:16:0x0044), top: B:2:0x0019, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00d4 A[Catch: Exception -> 0x0669, TryCatch #2 {Exception -> 0x0669, blocks: (B:3:0x0019, B:5:0x0025, B:9:0x002c, B:11:0x0038, B:251:0x0073, B:254:0x007c, B:256:0x0082, B:258:0x008d, B:260:0x0093, B:29:0x00e3, B:32:0x00eb, B:33:0x00ef, B:35:0x00f5, B:38:0x00fe, B:40:0x0108, B:42:0x011b, B:43:0x0124, B:44:0x0137, B:46:0x0146, B:47:0x0153, B:50:0x015b, B:52:0x0161, B:54:0x0167, B:55:0x0197, B:57:0x01a1, B:59:0x01a7, B:60:0x01c5, B:61:0x01d0, B:63:0x01d8, B:65:0x01de, B:66:0x01fc, B:67:0x0207, B:69:0x020f, B:71:0x0215, B:72:0x0233, B:73:0x023e, B:75:0x0246, B:77:0x024c, B:78:0x026a, B:79:0x0275, B:82:0x0296, B:84:0x02a0, B:85:0x02a5, B:87:0x02ab, B:88:0x02c9, B:91:0x02d9, B:92:0x0363, B:94:0x036d, B:96:0x037c, B:97:0x039c, B:98:0x03a5, B:101:0x03ae, B:103:0x03b4, B:104:0x03ef, B:107:0x03fa, B:109:0x0410, B:110:0x0435, B:112:0x043b, B:113:0x0460, B:115:0x0464, B:117:0x0474, B:118:0x0479, B:120:0x0483, B:121:0x048c, B:123:0x0492, B:124:0x049f, B:127:0x04aa, B:129:0x04c2, B:131:0x04c9, B:132:0x04d6, B:134:0x04e0, B:135:0x04e9, B:137:0x04f1, B:139:0x04f8, B:140:0x0505, B:142:0x050f, B:143:0x0518, B:144:0x0525, B:146:0x052d, B:153:0x0539, B:156:0x0547, B:158:0x056d, B:161:0x0576, B:163:0x057d, B:165:0x0585, B:168:0x058e, B:170:0x0595, B:172:0x05a1, B:177:0x062e, B:178:0x05af, B:180:0x05bb, B:182:0x05c5, B:184:0x05e0, B:185:0x05f0, B:188:0x05f7, B:189:0x05e9, B:190:0x05d0, B:192:0x05d6, B:194:0x05ff, B:196:0x060f, B:197:0x0620, B:200:0x0627, B:201:0x0618, B:203:0x0459, B:204:0x042e, B:206:0x03cb, B:207:0x03cf, B:209:0x03d5, B:210:0x03ec, B:211:0x02f1, B:213:0x030a, B:214:0x030e, B:215:0x02c4, B:216:0x0312, B:218:0x031e, B:219:0x0323, B:221:0x0329, B:222:0x0343, B:224:0x0349, B:225:0x0360, B:226:0x0340, B:227:0x0187, B:229:0x012e, B:236:0x0664, B:262:0x0087, B:263:0x0099, B:21:0x00a5, B:23:0x00ad, B:25:0x00b8, B:27:0x00be, B:238:0x00c2, B:240:0x00c8, B:241:0x00d0, B:242:0x00d4, B:244:0x00da, B:245:0x00b2, B:273:0x0053, B:14:0x003e, B:16:0x0044), top: B:2:0x0019, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00b2 A[Catch: Exception -> 0x0669, TryCatch #2 {Exception -> 0x0669, blocks: (B:3:0x0019, B:5:0x0025, B:9:0x002c, B:11:0x0038, B:251:0x0073, B:254:0x007c, B:256:0x0082, B:258:0x008d, B:260:0x0093, B:29:0x00e3, B:32:0x00eb, B:33:0x00ef, B:35:0x00f5, B:38:0x00fe, B:40:0x0108, B:42:0x011b, B:43:0x0124, B:44:0x0137, B:46:0x0146, B:47:0x0153, B:50:0x015b, B:52:0x0161, B:54:0x0167, B:55:0x0197, B:57:0x01a1, B:59:0x01a7, B:60:0x01c5, B:61:0x01d0, B:63:0x01d8, B:65:0x01de, B:66:0x01fc, B:67:0x0207, B:69:0x020f, B:71:0x0215, B:72:0x0233, B:73:0x023e, B:75:0x0246, B:77:0x024c, B:78:0x026a, B:79:0x0275, B:82:0x0296, B:84:0x02a0, B:85:0x02a5, B:87:0x02ab, B:88:0x02c9, B:91:0x02d9, B:92:0x0363, B:94:0x036d, B:96:0x037c, B:97:0x039c, B:98:0x03a5, B:101:0x03ae, B:103:0x03b4, B:104:0x03ef, B:107:0x03fa, B:109:0x0410, B:110:0x0435, B:112:0x043b, B:113:0x0460, B:115:0x0464, B:117:0x0474, B:118:0x0479, B:120:0x0483, B:121:0x048c, B:123:0x0492, B:124:0x049f, B:127:0x04aa, B:129:0x04c2, B:131:0x04c9, B:132:0x04d6, B:134:0x04e0, B:135:0x04e9, B:137:0x04f1, B:139:0x04f8, B:140:0x0505, B:142:0x050f, B:143:0x0518, B:144:0x0525, B:146:0x052d, B:153:0x0539, B:156:0x0547, B:158:0x056d, B:161:0x0576, B:163:0x057d, B:165:0x0585, B:168:0x058e, B:170:0x0595, B:172:0x05a1, B:177:0x062e, B:178:0x05af, B:180:0x05bb, B:182:0x05c5, B:184:0x05e0, B:185:0x05f0, B:188:0x05f7, B:189:0x05e9, B:190:0x05d0, B:192:0x05d6, B:194:0x05ff, B:196:0x060f, B:197:0x0620, B:200:0x0627, B:201:0x0618, B:203:0x0459, B:204:0x042e, B:206:0x03cb, B:207:0x03cf, B:209:0x03d5, B:210:0x03ec, B:211:0x02f1, B:213:0x030a, B:214:0x030e, B:215:0x02c4, B:216:0x0312, B:218:0x031e, B:219:0x0323, B:221:0x0329, B:222:0x0343, B:224:0x0349, B:225:0x0360, B:226:0x0340, B:227:0x0187, B:229:0x012e, B:236:0x0664, B:262:0x0087, B:263:0x0099, B:21:0x00a5, B:23:0x00ad, B:25:0x00b8, B:27:0x00be, B:238:0x00c2, B:240:0x00c8, B:241:0x00d0, B:242:0x00d4, B:244:0x00da, B:245:0x00b2, B:273:0x0053, B:14:0x003e, B:16:0x0044), top: B:2:0x0019, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8 A[Catch: Exception -> 0x0669, TryCatch #2 {Exception -> 0x0669, blocks: (B:3:0x0019, B:5:0x0025, B:9:0x002c, B:11:0x0038, B:251:0x0073, B:254:0x007c, B:256:0x0082, B:258:0x008d, B:260:0x0093, B:29:0x00e3, B:32:0x00eb, B:33:0x00ef, B:35:0x00f5, B:38:0x00fe, B:40:0x0108, B:42:0x011b, B:43:0x0124, B:44:0x0137, B:46:0x0146, B:47:0x0153, B:50:0x015b, B:52:0x0161, B:54:0x0167, B:55:0x0197, B:57:0x01a1, B:59:0x01a7, B:60:0x01c5, B:61:0x01d0, B:63:0x01d8, B:65:0x01de, B:66:0x01fc, B:67:0x0207, B:69:0x020f, B:71:0x0215, B:72:0x0233, B:73:0x023e, B:75:0x0246, B:77:0x024c, B:78:0x026a, B:79:0x0275, B:82:0x0296, B:84:0x02a0, B:85:0x02a5, B:87:0x02ab, B:88:0x02c9, B:91:0x02d9, B:92:0x0363, B:94:0x036d, B:96:0x037c, B:97:0x039c, B:98:0x03a5, B:101:0x03ae, B:103:0x03b4, B:104:0x03ef, B:107:0x03fa, B:109:0x0410, B:110:0x0435, B:112:0x043b, B:113:0x0460, B:115:0x0464, B:117:0x0474, B:118:0x0479, B:120:0x0483, B:121:0x048c, B:123:0x0492, B:124:0x049f, B:127:0x04aa, B:129:0x04c2, B:131:0x04c9, B:132:0x04d6, B:134:0x04e0, B:135:0x04e9, B:137:0x04f1, B:139:0x04f8, B:140:0x0505, B:142:0x050f, B:143:0x0518, B:144:0x0525, B:146:0x052d, B:153:0x0539, B:156:0x0547, B:158:0x056d, B:161:0x0576, B:163:0x057d, B:165:0x0585, B:168:0x058e, B:170:0x0595, B:172:0x05a1, B:177:0x062e, B:178:0x05af, B:180:0x05bb, B:182:0x05c5, B:184:0x05e0, B:185:0x05f0, B:188:0x05f7, B:189:0x05e9, B:190:0x05d0, B:192:0x05d6, B:194:0x05ff, B:196:0x060f, B:197:0x0620, B:200:0x0627, B:201:0x0618, B:203:0x0459, B:204:0x042e, B:206:0x03cb, B:207:0x03cf, B:209:0x03d5, B:210:0x03ec, B:211:0x02f1, B:213:0x030a, B:214:0x030e, B:215:0x02c4, B:216:0x0312, B:218:0x031e, B:219:0x0323, B:221:0x0329, B:222:0x0343, B:224:0x0349, B:225:0x0360, B:226:0x0340, B:227:0x0187, B:229:0x012e, B:236:0x0664, B:262:0x0087, B:263:0x0099, B:21:0x00a5, B:23:0x00ad, B:25:0x00b8, B:27:0x00be, B:238:0x00c2, B:240:0x00c8, B:241:0x00d0, B:242:0x00d4, B:244:0x00da, B:245:0x00b2, B:273:0x0053, B:14:0x003e, B:16:0x0044), top: B:2:0x0019, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3 A[Catch: Exception -> 0x0669, TryCatch #2 {Exception -> 0x0669, blocks: (B:3:0x0019, B:5:0x0025, B:9:0x002c, B:11:0x0038, B:251:0x0073, B:254:0x007c, B:256:0x0082, B:258:0x008d, B:260:0x0093, B:29:0x00e3, B:32:0x00eb, B:33:0x00ef, B:35:0x00f5, B:38:0x00fe, B:40:0x0108, B:42:0x011b, B:43:0x0124, B:44:0x0137, B:46:0x0146, B:47:0x0153, B:50:0x015b, B:52:0x0161, B:54:0x0167, B:55:0x0197, B:57:0x01a1, B:59:0x01a7, B:60:0x01c5, B:61:0x01d0, B:63:0x01d8, B:65:0x01de, B:66:0x01fc, B:67:0x0207, B:69:0x020f, B:71:0x0215, B:72:0x0233, B:73:0x023e, B:75:0x0246, B:77:0x024c, B:78:0x026a, B:79:0x0275, B:82:0x0296, B:84:0x02a0, B:85:0x02a5, B:87:0x02ab, B:88:0x02c9, B:91:0x02d9, B:92:0x0363, B:94:0x036d, B:96:0x037c, B:97:0x039c, B:98:0x03a5, B:101:0x03ae, B:103:0x03b4, B:104:0x03ef, B:107:0x03fa, B:109:0x0410, B:110:0x0435, B:112:0x043b, B:113:0x0460, B:115:0x0464, B:117:0x0474, B:118:0x0479, B:120:0x0483, B:121:0x048c, B:123:0x0492, B:124:0x049f, B:127:0x04aa, B:129:0x04c2, B:131:0x04c9, B:132:0x04d6, B:134:0x04e0, B:135:0x04e9, B:137:0x04f1, B:139:0x04f8, B:140:0x0505, B:142:0x050f, B:143:0x0518, B:144:0x0525, B:146:0x052d, B:153:0x0539, B:156:0x0547, B:158:0x056d, B:161:0x0576, B:163:0x057d, B:165:0x0585, B:168:0x058e, B:170:0x0595, B:172:0x05a1, B:177:0x062e, B:178:0x05af, B:180:0x05bb, B:182:0x05c5, B:184:0x05e0, B:185:0x05f0, B:188:0x05f7, B:189:0x05e9, B:190:0x05d0, B:192:0x05d6, B:194:0x05ff, B:196:0x060f, B:197:0x0620, B:200:0x0627, B:201:0x0618, B:203:0x0459, B:204:0x042e, B:206:0x03cb, B:207:0x03cf, B:209:0x03d5, B:210:0x03ec, B:211:0x02f1, B:213:0x030a, B:214:0x030e, B:215:0x02c4, B:216:0x0312, B:218:0x031e, B:219:0x0323, B:221:0x0329, B:222:0x0343, B:224:0x0349, B:225:0x0360, B:226:0x0340, B:227:0x0187, B:229:0x012e, B:236:0x0664, B:262:0x0087, B:263:0x0099, B:21:0x00a5, B:23:0x00ad, B:25:0x00b8, B:27:0x00be, B:238:0x00c2, B:240:0x00c8, B:241:0x00d0, B:242:0x00d4, B:244:0x00da, B:245:0x00b2, B:273:0x0053, B:14:0x003e, B:16:0x0044), top: B:2:0x0019, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5 A[Catch: Exception -> 0x0669, TryCatch #2 {Exception -> 0x0669, blocks: (B:3:0x0019, B:5:0x0025, B:9:0x002c, B:11:0x0038, B:251:0x0073, B:254:0x007c, B:256:0x0082, B:258:0x008d, B:260:0x0093, B:29:0x00e3, B:32:0x00eb, B:33:0x00ef, B:35:0x00f5, B:38:0x00fe, B:40:0x0108, B:42:0x011b, B:43:0x0124, B:44:0x0137, B:46:0x0146, B:47:0x0153, B:50:0x015b, B:52:0x0161, B:54:0x0167, B:55:0x0197, B:57:0x01a1, B:59:0x01a7, B:60:0x01c5, B:61:0x01d0, B:63:0x01d8, B:65:0x01de, B:66:0x01fc, B:67:0x0207, B:69:0x020f, B:71:0x0215, B:72:0x0233, B:73:0x023e, B:75:0x0246, B:77:0x024c, B:78:0x026a, B:79:0x0275, B:82:0x0296, B:84:0x02a0, B:85:0x02a5, B:87:0x02ab, B:88:0x02c9, B:91:0x02d9, B:92:0x0363, B:94:0x036d, B:96:0x037c, B:97:0x039c, B:98:0x03a5, B:101:0x03ae, B:103:0x03b4, B:104:0x03ef, B:107:0x03fa, B:109:0x0410, B:110:0x0435, B:112:0x043b, B:113:0x0460, B:115:0x0464, B:117:0x0474, B:118:0x0479, B:120:0x0483, B:121:0x048c, B:123:0x0492, B:124:0x049f, B:127:0x04aa, B:129:0x04c2, B:131:0x04c9, B:132:0x04d6, B:134:0x04e0, B:135:0x04e9, B:137:0x04f1, B:139:0x04f8, B:140:0x0505, B:142:0x050f, B:143:0x0518, B:144:0x0525, B:146:0x052d, B:153:0x0539, B:156:0x0547, B:158:0x056d, B:161:0x0576, B:163:0x057d, B:165:0x0585, B:168:0x058e, B:170:0x0595, B:172:0x05a1, B:177:0x062e, B:178:0x05af, B:180:0x05bb, B:182:0x05c5, B:184:0x05e0, B:185:0x05f0, B:188:0x05f7, B:189:0x05e9, B:190:0x05d0, B:192:0x05d6, B:194:0x05ff, B:196:0x060f, B:197:0x0620, B:200:0x0627, B:201:0x0618, B:203:0x0459, B:204:0x042e, B:206:0x03cb, B:207:0x03cf, B:209:0x03d5, B:210:0x03ec, B:211:0x02f1, B:213:0x030a, B:214:0x030e, B:215:0x02c4, B:216:0x0312, B:218:0x031e, B:219:0x0323, B:221:0x0329, B:222:0x0343, B:224:0x0349, B:225:0x0360, B:226:0x0340, B:227:0x0187, B:229:0x012e, B:236:0x0664, B:262:0x0087, B:263:0x0099, B:21:0x00a5, B:23:0x00ad, B:25:0x00b8, B:27:0x00be, B:238:0x00c2, B:240:0x00c8, B:241:0x00d0, B:242:0x00d4, B:244:0x00da, B:245:0x00b2, B:273:0x0053, B:14:0x003e, B:16:0x0044), top: B:2:0x0019, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.lang.String> b(java.lang.String r22, com.mbridge.msdk.foundation.same.report.d.b r23) {
        /*
            Method dump skipped, instructions count: 1654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.d.e.b(java.lang.String, com.mbridge.msdk.foundation.same.report.d.b):java.util.Map");
    }

    private Map<String, String> a(String str, b bVar) {
        return (bVar == null || TextUtils.isEmpty(str)) ? new HashMap() : bVar.j(str);
    }

    private com.mbridge.msdk.tracker.e a(String str, Map<String, String> map) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(str);
        try {
            JSONObject jSONObject = new JSONObject(map);
            Boolean b3 = com.mbridge.msdk.foundation.same.b.a().b();
            if (b3 != null) {
                jSONObject.put("r_v_r", b3.booleanValue() ? 1 : 0);
            }
            eVar.a(jSONObject);
            eVar.a(0);
            eVar.b(0);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return eVar;
    }

    private Map<String, String> a(String str, String str2, m mVar) {
        d dVar = new d();
        try {
            g b3 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b3 == null) {
                h.a();
                b3 = i.a();
            }
            if (!TextUtils.isEmpty(b3.ak())) {
                dVar.a("as_rid", b3.ak());
            }
            String M = b3.M();
            JSONArray L = b3.L();
            if (L != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= L.length()) {
                        break;
                    }
                    if (str.equals(L.getString(i10))) {
                        M = "1.0";
                        break;
                    }
                    i10++;
                }
            }
            if (!TextUtils.isEmpty(M)) {
                dVar.a("log_rate", M);
            } else {
                dVar.a("log_rate", -1);
            }
            if (!TextUtils.isEmpty(str2)) {
                k c10 = h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), str2);
                if (c10 != null && !TextUtils.isEmpty(c10.s())) {
                    dVar.a("us_rid", c10.s());
                }
                if (c10 != null && !TextUtils.isEmpty(c10.a())) {
                    dVar.a("u_stid", c10.a());
                }
                d a = c.a().a(str2);
                if (a != null) {
                    if (mVar != null && mVar.g() != null) {
                        try {
                            mVar.g().put("r_stid", a.b("r_stid"));
                            a.c("r_stid");
                        } catch (JSONException unused) {
                        }
                    }
                    dVar.a(a);
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return dVar.a();
    }

    private List<CampaignEx> a(b bVar, String str) {
        int intValue;
        ArrayList arrayList = new ArrayList();
        if (bVar != null) {
            try {
                String str2 = bVar.f() + str;
                Map<String, Map<String, String>> p10 = bVar.p();
                int i10 = -1;
                if (p10 != null && p10.containsKey(str2)) {
                    try {
                        Object obj = p10.get(str2).get("resource_type");
                        if (obj instanceof String) {
                            intValue = Integer.parseInt((String) obj);
                        } else if (obj instanceof Integer) {
                            intValue = ((Integer) obj).intValue();
                        }
                        i10 = intValue;
                    } catch (NumberFormatException e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                        }
                    }
                }
                if (i10 == 1) {
                    List<CampaignEx> h10 = bVar.h() != null ? bVar.h() : bVar.e();
                    if (h10 != null && h10.size() > 0) {
                        arrayList.addAll(h10);
                    }
                } else if (bVar.g() != null) {
                    arrayList.add(bVar.g());
                } else {
                    List<CampaignEx> h11 = bVar.h() != null ? bVar.h() : bVar.e();
                    if (h11 != null && h11.size() > 0) {
                        arrayList.addAll(h11);
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
        return arrayList;
    }
}
