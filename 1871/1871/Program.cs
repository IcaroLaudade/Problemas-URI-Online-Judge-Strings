using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1871
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true) {
                String[] nums = Console.ReadLine().Split(' ');
                int m = int.Parse(nums[0]);
                int n = int.Parse(nums[1]);
                if (m == 0 && n == 0) {
                    break;
                }
                int soma = m + n;
                string res = soma.ToString();
                res = res.Replace("0","");
                Console.WriteLine(res);

            }
        }
    }
}
