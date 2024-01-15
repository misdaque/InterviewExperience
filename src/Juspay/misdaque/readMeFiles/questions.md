###### All Questions were on Graphs. Questions level I would say was easy to medium.

### Q1) 
    JS newbie “A” wants to learn React from “B” and wants to know in his network 
    who can introduce him to B in the shortest time period.

    INPUT FORMAT
    
    Total Members in UI Friend Network = N
    
    MemberId1 = N1
    MemberId2 = N2
    MemberId3 = N3
    MemberIdN = Nn
    
    Total Possible Edges = E
    
    <Follower 1><Following 1><Time taken to send the message> = p1,q1,t1
    <Follower 2><Following 2><Time taken to send the message> = p2,q2,t2
    <Follower 3><Following 3><Time taken to send the message> = p3,q3,t3
    <Follower N><Following N><Time taken to send the message> = pn,qn,tn
    
    Follower (Ninja A) = A
    Following (JS expert B) = B
    
    OUTPUT FORMAT
    
    Shortest Time A takes to reach B
    
    Sample Input
    
    4
    2
    5
    7
    9
    4
    2 9 2
    7 2 3
    7 9 7
    9 5 1
    7
    9
    
    Sample Output
    
    5

#### Q2)

    A Nagging React newbie “B” is constantly troubling React expert “A”. 
    React Expert “A” needs to know the minimum set of people following him he needs to remove
    from his network to stop “B” from reaching out to him.
    
    INPUT FORMAT
    
    Total Members in UI Friend Network = N
    
    MemberId1 = N1
    MemberId2 = N2
    MemberId3 = N3
    MemberIdN = Nn
    
    Total Possible Edges = E
    
    <Follower 1><Following 1>
    <Follower 2><Following 2>
    <Follower 3><Following 3>
    <Follower N><Following N>
    
    Follower = A
    Following = B
    
    OUTPUT FORMAT
    
    Set of memberId “A” needs to block
    
    Sample Input
    
    4
    2
    5
    7
    9
    4
    2 9
    7 2
    7 9
    9 5
    7
    9
    
    Sample Output
    2 7

#### Q3)

    JS newbie “A” wants to check if he can reach out to a React expert “B” using his network of
    React developers. If he can then return 1 else return 0
    
    INPUT FORMAT
    
    Total members in React Developer Community = N
    MemberId1 = N1
    MemberId2 = N2
    MemberId3 = N3
    MemberIdN = Nn
    
    Total possible edges = E
    <follower 1 (member ID)><following 1 (member ID)> = u1,v1
    <follower 2 (member ID)><following 2 (member ID)> = u2,v2
    ………………
    
    <follower N ><following N > = un,vn
    Follower = A
    Following = B
    
    OUTPUT FORMAT
    
    If A can reach B then output is 1, else 0.
    
    Sample Input
    4
    2
    5
    7
    9
    4
    2 9
    7 2
    7 9
    9 5
    7
    9
    
    Sample output
    1