package drawOAndr;

public class AxisCalculator {
	private static final float[] BaseIntervals = { 1, 2, 2.5f, 5 };
	public static float[] cal(int minCount, float min, float max) {
		float[] res = new float[3];
		float diff = max - min;
		float maxInterval = diff / minCount;
		res[0] = pickInterval(maxInterval);
		res[1] = fiMndFirstDegreeWith(max, res[0]);
		return res;
	}

	public static float fiMndFirstDegreeWith(float start, float interval) {
		int many = (int) (start / interval);
		if (start <= 0 || isEqual(start, interval * many)) {
			return interval * many;
		}
		return interval * (many + 1);
	}

	public static boolean isEqual(float exp, float res) {
		return Math.abs(res - exp) < 0.000001f;
	}

	public static float pickInterval(float minInterval) {
		int powForMin = calPow(minInterval);
		float intervalBase = minInterval / (float) Math.pow(10, powForMin);
		float minPick = pickBaseIntervalFrom(intervalBase);
		return minPick * (float) Math.pow(10, powForMin);
	}

	public static float pickBaseIntervalFrom(float maxInterval) {
		float value = BaseIntervals[BaseIntervals.length - 1];
		for (int i = 1; i < BaseIntervals.length; i++) {
			if (maxInterval < BaseIntervals[i]) {
				value = BaseIntervals[i - 1];
				break;
			}
		}
		return value;
	}

	public static int calPow(float maxInterval) {
		int pow = 0;
		float temp = Math.abs(maxInterval);
		if (temp < 1 && temp != 0) {
			while (temp < 1) {
				temp *= 10;
				pow--;
			}
		} else if (temp >= 10) {
			while (temp >= 10) {
				temp /= 10;
				pow++;
			}
		}
		return pow;
	}

}
